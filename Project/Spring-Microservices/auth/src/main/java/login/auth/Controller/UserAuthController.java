package login.auth.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import login.auth.Models.UserModel;
import login.auth.Service.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class UserAuthController {
    // Rest Template
    @Autowired
    private RestTemplate restTemplate;

    // Repositroy
    @Autowired
    private UserRepository userRepository;

    // Update User
    @PutMapping("/editUser/{username}")
    public UserModel editUser(@PathVariable String username, @RequestBody UserModel updatedUser) {

        UserModel user = userRepository.findById(username).orElseThrow();
        user.setUserName(updatedUser.getUserName());
        user.setFirstName(updatedUser.getFirstName());
        user.setPassword(updatedUser.getPassword());
        user.setEmail(updatedUser.getEmail());
        userRepository.save(user);
        return user;
    }

    // User Details
    @GetMapping("/{username}")
    public ResponseEntity<?> getUserDetails(@PathVariable String username) {
        return ResponseEntity.ok(userRepository.findById(username).get());
    }

    // Deals Micro-service
    @PutMapping("/grabDeal/{username}/{dealCode}")
    public ResponseEntity<?> grabDeal(@PathVariable String username, @PathVariable String dealCode) {
        restTemplate.put("https://deals-manager/user/grabDeal/" + username + "/" + dealCode, null,
                ResponseEntity.class);
        return ResponseEntity.ok("Deal Added!");
    }

    // Coupons Micro-service
    @PutMapping("/grabCoupon/{username}/{couponCode}")
    public ResponseEntity<?> grabCoupon(@PathVariable String username, @PathVariable String couponCode) {
        restTemplate.put("https://coupons-manager/user/grabCoupon/" + username + "/" + couponCode, null,
                ResponseEntity.class);
        return ResponseEntity.ok("Coupon Added!");
    }

}
