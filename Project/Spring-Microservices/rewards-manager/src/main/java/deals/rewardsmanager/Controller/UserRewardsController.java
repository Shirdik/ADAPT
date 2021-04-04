package deals.rewardsmanager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deals.rewardsmanager.Models.RewardsModel;
import deals.rewardsmanager.Service.RewardsRepository;

@RestController
@RequestMapping("/user")
public class UserRewardsController {

    @Autowired
    RewardsRepository rewardsRepository;

    @PutMapping("/addRewards/{id}/{rewards}")
    public ResponseEntity<?> addRewards(@PathVariable int id, @PathVariable double rewards)
            throws UsernameNotFoundException {

        RewardsModel user = rewardsRepository.findById(id).orElseThrow();

        user.setRewards(user.getRewards() + rewards);

        rewardsRepository.save(user);
        return ResponseEntity.ok("Added to the Rewards:" + user.getRewards());

    }

    @PutMapping("/reduceRewards/{id}/{rewards}")
    public ResponseEntity<?> reduceRewards(@PathVariable double rewards, @PathVariable int id)
            throws UsernameNotFoundException {

        RewardsModel user = rewardsRepository.findById(id).orElseThrow();

        if (user.getRewards() < rewards)
            return ResponseEntity.ok("Cannot Reduce due to insufficent Rewards");

        user.setRewards(user.getRewards() - rewards);

        rewardsRepository.save(user);
        return ResponseEntity.ok("Removed from the Rewards:" + user.getRewards());

    }

}
