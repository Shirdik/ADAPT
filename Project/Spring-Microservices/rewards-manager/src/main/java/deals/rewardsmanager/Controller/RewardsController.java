package deals.rewardsmanager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deals.rewardsmanager.Models.RewardsModel;
import deals.rewardsmanager.Service.RewardsRepository;

@RestController
public class RewardsController {

    @Autowired
    RewardsRepository rewardsRepository;

    // Home
    @RequestMapping("/")
    public String home() {
        return "<h1>Welcome!</h1>";
    }

    // User Page
    @RequestMapping("/user")
    public String user() {
        return "<h1>Welcome user!</h1>";
    }

    // Admin Page
    @RequestMapping("/admin")
    public String admin() {
        return "<h1>Welcome admin!</h1>";
    }

    @PostMapping("/addUser")
    public ResponseEntity<?> addUser(@RequestBody RewardsModel rewardsModel) {

        rewardsRepository.save(rewardsModel);
        return ResponseEntity.ok("Added User to the Rewards Database with id:" + rewardsModel.getUserId());

    }

}
