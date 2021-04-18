package login.auth.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import login.auth.Models.CouponsModel;
import login.auth.Models.DealsModel;
import login.auth.Models.UserModel;
import login.auth.Service.UserRepository;
import login.auth.dto.RequestResponse;

@CrossOrigin(origins = "http://localhost:3000")
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

    // Coupons Micro-service
    @PostMapping("/addCoupon")
    public ResponseEntity<?> addCoupon(@RequestBody CouponsModel coupon) {
        return ResponseEntity.ok(
                restTemplate.postForObject("https://coupons-manager/admin/addCoupon", coupon, RequestResponse.class));
    }

    @DeleteMapping("/removeCoupon/{couponCode}")
    public ResponseEntity<?> removeCoupon(@PathVariable String couponCode) {
        restTemplate.delete("https://coupons-manager/admin/removeCoupon/" + couponCode);
        return ResponseEntity.ok("Deleted coupon with CouponCode:" + couponCode);

    }

    // Deals Micro-service
    @PostMapping("/addDeal")
    public ResponseEntity<?> addDeal(@RequestBody DealsModel deal) {
        return ResponseEntity
                .ok(restTemplate.postForObject("https://deals-manager/admin/addDeal", deal, RequestResponse.class));
    }

    @DeleteMapping("/removeDeal/{dealCode}")
    public ResponseEntity<?> removeDeal(@PathVariable String dealCode) {
        restTemplate.delete("https://deals-manager/admin/removeDeal/" + dealCode);
        return ResponseEntity.ok("Deleted deal with DealCode:" + dealCode);

    }

}
