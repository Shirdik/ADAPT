package login.auth.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import login.auth.Models.AuthenticationRequest;
import login.auth.Models.RequestResponse;
import login.auth.Models.RewardsModel;
import login.auth.Models.UserModel;
import login.auth.Service.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    // Repositroy
    @Autowired
    private UserRepository userRepository;

    @Autowired
    RestTemplate restTemplate;

    // Home
    @RequestMapping("/")
    public String home() {
        return "<h1>Welcome to Auth-Application!</h1>";
    }

    // User Page
    @RequestMapping("/user")
    public String user() {
        return "<h1>Welcome to Auth-Application user!</h1>";
    }

    // Admin Page
    @RequestMapping("/admin")
    public String admin() {
        return "<h1>Welcome to Auth-Application admin!</h1>";
    }

    // Sign In Page
    // Let's the user to sign in
    @PostMapping("/logIn")
    public ResponseEntity<?> signIn(@RequestBody AuthenticationRequest auth) {

        String username = auth.getUsername();
        String password = auth.getPassword();

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (BadCredentialsException e) {
            return ResponseEntity.ok(new RequestResponse("Authentication Failed! " + e));
        }
        return ResponseEntity.ok(new RequestResponse("Authentication Succesful! " + username));
    }

    // Sign Up Page
    // To create new user and add it to the database
    @PostMapping("/signUp")
    public ResponseEntity<?> signUp(@RequestBody UserModel user) {

        userRepository.save(user);
        restTemplate.postForLocation("https://rewards-manager/addUser", new RewardsModel(user.getId(), 20.00),
                ResponseEntity.class);
        return ResponseEntity.ok(new RequestResponse("Added User to the Database with id: " + user.getId()));

    }

    // Find the user by id
    // For Validation through other services
    @GetMapping("/allUsers/{id}")
    public Optional<UserModel> getUser(@PathVariable int id) {
        return userRepository.findById(id);
    }

}
