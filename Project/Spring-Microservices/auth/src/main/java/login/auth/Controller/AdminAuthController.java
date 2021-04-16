package login.auth.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import login.auth.Models.RequestResponse;
import login.auth.Models.UserModel;
import login.auth.Service.UserRepository;

@RestController
@RequestMapping("/admin")
public class AdminAuthController {

    @Autowired
    RestTemplate restTemplate;

    // Repositroy
    @Autowired
    private UserRepository userRepository;

    // Users List
    // List of all users in the database
    @GetMapping("/allUsers")
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    // To delete by id
    @DeleteMapping("/delete/{username}")
    public ResponseEntity<?> deleteUser(@PathVariable String username) throws Exception {
        userRepository.deleteById(username);
        restTemplate.delete("https://rewards-manager/admin/delete/" + username);
        return ResponseEntity.ok(new RequestResponse("Deleted User from the Database with name: " + username));

    }

}
