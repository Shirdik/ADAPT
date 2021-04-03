package deals.rewardsmanager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deals.rewardsmanager.Models.RewardsModel;
import deals.rewardsmanager.Service.RewardsRepository;

@RestController
@RequestMapping("/user")
public class UserRewardsController {

    @Autowired
    RewardsRepository rewardsRepository;

    @PutMapping("/addRewards/{id}")
    public ResponseEntity<?> addRewards(@PathVariable int id, @RequestBody Double rewards) {

        RewardsModel user = rewardsRepository.findById(id).orElse(new RewardsModel(0, 0));

        if (user.getUserId() == 0)
            return ResponseEntity.ok("User Not Found with id: " + id);

        user.setRewards(user.getRewards() + rewards);

        rewardsRepository.save(user);
        return ResponseEntity.ok("Added to the Rewards:" + user.getRewards());

    }

    @PutMapping("/reduceRewards/{id}")
    public ResponseEntity<?> reduceRewards(@RequestBody int rewards, @PathVariable int id) {

        RewardsModel user = rewardsRepository.findById(id).orElse(new RewardsModel(0, 0));

        if (user.getUserId() == 0)
            return ResponseEntity.ok("User Not Found with id: " + id);

        if (user.getRewards() < rewards)
            return ResponseEntity.ok("Cannot Reduce due to insufficent Rewards");

        user.setRewards(user.getRewards() - rewards);

        rewardsRepository.save(user);
        return ResponseEntity.ok("Removed from the Rewards:" + user.getRewards());

    }

}
