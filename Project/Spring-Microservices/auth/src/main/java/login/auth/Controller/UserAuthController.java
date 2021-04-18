package login.auth.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import login.auth.dto.CouponAdder;
import login.auth.dto.DealAdder;
import login.auth.dto.RequestResponse;
// import login.auth.Models.DealsModel;
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
    @PutMapping("/editUser/{id}")
    public UserModel editUser(@PathVariable String username, @RequestBody UserModel updateUser) {

        UserModel user = userRepository.findById(username).orElseThrow();
        user.setUserName(updateUser.getUserName());
        user.setFirstName(updateUser.getFirstName());
        user.setPassword(updateUser.getPassword());
        user.setEmail(updateUser.getEmail());
        userRepository.save(user);
        return user;
    }

    // Add Deal
    @PutMapping("/addDealCode")
    public ResponseEntity<?> addDealCode(@RequestBody DealAdder dealAdder) {

        UserModel user = userRepository.findById(dealAdder.getUsername()).orElseThrow();
        user.addDealCode(dealAdder.getDealCode());
        userRepository.save(user);
        return ResponseEntity.ok(new RequestResponse("Deal added to the User Account!\nDeal id:"
                + dealAdder.getDealCode() + "\nUser Id:" + dealAdder.getUsername()));

    }

    // Add Coupon
    @PutMapping("/addCouponCode")
    public ResponseEntity<?> addCouponCode(@RequestBody CouponAdder couponAdder) {
        UserModel user = userRepository.findById(couponAdder.getUsername()).orElseThrow();
        user.addCouponCode(couponAdder.getCouponCode());
        userRepository.save(user);
        return ResponseEntity.ok(new RequestResponse("Coupon added to the User Account!\nCoupon id:"
                + couponAdder.getCouponCode() + "\nUser Id:" + couponAdder.getUsername()));

    }

    // Deals Micro-service
    @PutMapping("/grabDeal/{username}/{dealCode}")
    public ResponseEntity<?> grabDeal(@PathVariable String username, @PathVariable String dealCode) {
        restTemplate.put("https://deals-manager/user/grabDeal/" + username + "/" + dealCode, null,
                ResponseEntity.class);
        return ResponseEntity.ok("Deal Added!");
    }

    // Coupons Micro-service
    @PutMapping("/grabCoupon/{username}/{dealCode}")
    public ResponseEntity<?> grabCoupon(@PathVariable String username, @PathVariable String couponCode) {
        restTemplate.put("https://coupons-manager/user/grabDeal/" + username + "/" + couponCode, null,
                ResponseEntity.class);
        return ResponseEntity.ok("Coupon Added!");
    }

}
