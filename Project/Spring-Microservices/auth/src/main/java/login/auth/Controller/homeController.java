package login.auth.Controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import login.auth.Models.AuthenticationRequest;
import login.auth.Models.AuthenticationResponse;
import login.auth.Models.UserModel;
import login.auth.Service.UserRepository;

@RestController
public class homeController {

    @Autowired
    AuthenticationManager authenticationManager;

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

    // Repositroy
    @Autowired
    private UserRepository repository;

    // Sign In Page
    // Let's the user to sign in
    @PostMapping("/logIn")
    public ResponseEntity<?> signIn(@RequestBody AuthenticationRequest auth) {

        String username = auth.getUsername();
        String password = auth.getPassword();

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (BadCredentialsException e) {
            return ResponseEntity.ok(new AuthenticationResponse("Authentication Failed! " + e));
        }
        return ResponseEntity.ok(new AuthenticationResponse("Authentication Succesful! " + username));
    }

    // Sign Up Page
    // To create new user and add it to the database
    @PostMapping("/signUp")
    public ResponseEntity<?> signUp(@RequestBody UserModel user) {

        repository.save(user);
        return ResponseEntity.ok(new AuthenticationResponse("Added User to the Database with id: " + user.getId()));

    }

    // @PutMapping("/updateUser")
    // public ResponseEntity<?> updateUser(@RequestBody UserModel user) {
    // UserModel foundUser = repository.findByUserName(user.getUsername());

    // }

    // Users List
    // List of all users in the database
    @GetMapping("/allUsers")
    public List<UserModel> getAllUsers() {
        return repository.findAll();
    }

    // Find the user by id
    @GetMapping("/allUsers/{id}")
    public Optional<UserModel> getUser(@PathVariable int id) {
        return repository.findById(id);
    }

    // To delete by id
    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id) throws Exception {
        repository.deleteById(id);
        return ResponseEntity.ok(new AuthenticationResponse("Deleted User from the Database with id: " + id));
    }

    // Update User
    @PutMapping("/ediUser/{id}")
    public UserModel editUser(@PathVariable int id, @RequestBody UserModel updateUser) {

        UserModel user = repository.findById(id).orElseThrow();
        user.setUserName(updateUser.getUserName());
        user.setFirstName(updateUser.getFirstName());
        user.setPassword(updateUser.getPassword());
        user.setEmail(updateUser.getEmail());
        repository.save(user);
        return user;
    }

    // Add Deal
    @PutMapping("/addDealId/{userId}/{dealId}")
    public List<Integer> addDealId(@PathVariable int userId, @PathVariable int dealId) {
        UserModel user = repository.findById(userId).orElseThrow();
        user.addDealId(dealId);
        return user.getDealIds();

    }

    // Add Coupon
    @PutMapping("/addCouponId/{userId}/{dealId}")
    public List<Integer> addCouponId(@PathVariable int userId, @PathVariable int couponId) {
        UserModel user = repository.findById(userId).orElseThrow();
        user.addCouponId(couponId);
        return user.getCouponIds();

    }
}
