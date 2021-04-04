package deals.dealsmanager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deals.dealsmanager.Service.DealsRepository;
import deals.dealsmanager.Service.DealsService;
import deals.dealsmanager.Models.*;

@RestController
@RequestMapping("/user")
public class UserDealsContoller extends DealsService {

    @Autowired
    DealsRepository dealsRepository;

    @PutMapping("/grabDeal/{userId}/{dealId}")
    public ResponseEntity<?> grabDeal(@PathVariable int userId, @PathVariable int dealId) {
        if (isValidUser(userId)) {

            DealsModel deal = dealsRepository.findById(dealId).orElseThrow();
            // Adding User to the Deals
            if (dealsRepository.findById(userId) == null)
                deal.addUserId(userId);
            else
                return ResponseEntity.ok("UserId: " + userId + "is already in the List");

            dealsRepository.save(deal);
            // Adding Rewards in the User Account
            if (rewardsAdder(userId, deal.getRewards()))
                return ResponseEntity.ok("Deal Added!:" + dealId);

            // If Rewards are not added in the User Account
            return ResponseEntity.ok("Couldn't add Rewards in the User Account with id:" + userId);

        }
        // If the User id is not valid or the user is not found!
        return ResponseEntity.ok("User Not Found! with id:" + userId);
    }
}