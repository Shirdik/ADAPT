package deals.dealsmanager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import deals.dealsmanager.Service.DealsRepository;
import deals.dealsmanager.Service.DealsService;
import deals.dealsmanager.Models.*;
import deals.dealsmanager.dto.*;

@RestController
@RequestMapping("/user")
public class UserDealsContoller extends DealsService {

    @Autowired
    DealsRepository dealsRepository;

    @Autowired
    RestTemplate restTemplate;

    @PutMapping("/grabDeal/{username}/{dealCode}")
    public ResponseEntity<?> grabDeal(@PathVariable String username, @PathVariable String dealCode) {
        if (isValidUser(username)) {

            DealsModel deal = dealsRepository.findById(dealCode).orElseThrow();
            // Adding User to the Deals
            if (!deal.getUsernames().contains(username)) {
                deal.addUsername(username);
                restTemplate.put("https://auth-application/addDealCode", new DealAdder(username, dealCode));
                rewardsAdder(username, deal.getRewards());

            } else
                return ResponseEntity.ok(new RequestResponse(username + "is already in the List"));

            dealsRepository.save(deal);

            // Adding Rewards in the User Account
            return ResponseEntity.ok(new RequestResponse("Deal Added!:" + dealCode));
        }
        // If the User id is not valid or the user is not found!
        return ResponseEntity.ok(new RequestResponse("User Not Found! with id:" + username));
    }
}
