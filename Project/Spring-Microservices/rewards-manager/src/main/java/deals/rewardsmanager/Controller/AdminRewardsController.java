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

    @GetMapping("/allUsers/{id}")
    public Optional<RewardsModel> getUser(@PathVariable int id) {
        return rewardsRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id) throws UsernameNotFoundException {

        rewardsRepository.deleteById(id);
        return ResponseEntity.ok("Deleted User from the database with id:" + id);
    }
}
