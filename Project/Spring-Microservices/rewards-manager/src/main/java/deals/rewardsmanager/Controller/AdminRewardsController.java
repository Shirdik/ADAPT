package deals.rewardsmanager.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deals.rewardsmanager.Models.RewardsModel;
import deals.rewardsmanager.Service.RewardsRepository;

@RestController
@RequestMapping("/admin")
public class AdminRewardsController {

    @Autowired
    RewardsRepository rewardsRepository;

    @GetMapping("/allUsers")
    public List<RewardsModel> getAllUsers() {
        return rewardsRepository.findAll();
    }

    @GetMapping("/allUsers/{username}")
    public Optional<RewardsModel> getUser(@PathVariable String username) {
        return rewardsRepository.findById(username);
    }

    @DeleteMapping("/delete/{username}")
    public ResponseEntity<?> deleteUser(@PathVariable String username) throws UsernameNotFoundException {

        rewardsRepository.deleteById(username);
        return ResponseEntity.ok("Deleted User from the database with id:" + username);
    }
}
