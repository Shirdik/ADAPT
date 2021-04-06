package deals.rewardsmanager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deals.rewardsmanager.Models.RewardsModel;
import deals.rewardsmanager.Models.RewardsRequest;
import deals.rewardsmanager.Service.RewardsRepository;

@RestController
@RequestMapping("/user")
public class UserRewardsController {

    @Autowired
    RewardsRepository rewardsRepository;

    @PutMapping("/addRewards")
    public ResponseEntity<?> addRewards(@RequestBody RewardsRequest rewardsRequest) throws UsernameNotFoundException {

        RewardsModel user = rewardsRepository.findById(rewardsRequest.getUserId()).orElseThrow();

        user.setRewards(user.getRewards() + rewardsRequest.getRewards());

        rewardsRepository.save(user);
        return ResponseEntity.ok("Added to the Rewards:" + user.getRewards());

    }

    @PutMapping("/reduceRewards/")
    public ResponseEntity<?> reduceRewards(@RequestBody RewardsRequest rewardsRequest)
            throws UsernameNotFoundException {

        RewardsModel user = rewardsRepository.findById(rewardsRequest.getUserId()).orElseThrow();

        if (user.getRewards() < rewardsRequest.getRewards())
            return ResponseEntity.ok("Cannot Reduce due to insufficent Rewards");

        user.setRewards(user.getRewards() - rewardsRequest.getRewards());

        rewardsRepository.save(user);
        return ResponseEntity.ok("Removed from the Rewards:" + user.getRewards());

    }

}
