package deals.dealsmanager.Controller;

import com.netflix.discovery.converters.Auto;

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

@RestController
@RequestMapping("/user")
public class UserDealsContoller extends DealsService {

    @Autowired
    DealsRepository dealsRepository;

    @Autowired
    RestTemplate restTemplate;

    @PutMapping("/grabDeal/{userId}/{dealId}")
    public ResponseEntity<?> grabDeal(@PathVariable int userId, @PathVariable int dealId) {
        if (isValidUser(userId)) {

            DealsModel deal = dealsRepository.findById(dealId).orElseThrow();
            // Adding User to the Deals
            if (!deal.getUserIds().contains(userId)) {
                deal.addUserId(userId);
                restTemplate.put("https://auth-application/user/addDealId", new DealAdder(userId, dealId));
                rewardsAdder(userId, deal.getRewards());

            } else
                return ResponseEntity.ok(new RequestResponse(userId + "is already in the List"));

            dealsRepository.save(deal);

            // Adding Rewards in the User Account
            return ResponseEntity.ok(new RequestResponse("Deal Added!:" + dealId));
        }
        // If the User id is not valid or the user is not found!
        return ResponseEntity.ok(new RequestResponse("User Not Found! with id:" + userId));
    }
}
