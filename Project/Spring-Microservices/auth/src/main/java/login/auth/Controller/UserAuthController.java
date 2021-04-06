package login.auth.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import login.auth.Models.CouponAdder;
import login.auth.Models.DealAdder;
import login.auth.Models.RequestResponse;
import login.auth.Models.UserModel;
import login.auth.Service.UserRepository;

@RestController
@RequestMapping("/user")
public class UserAuthController {

    // Repositroy
    @Autowired
    private UserRepository userRepository;

    // Update User
    @PutMapping("/editUser/{id}")
    public UserModel editUser(@PathVariable int id, @RequestBody UserModel updateUser) {

        UserModel user = userRepository.findById(id).orElseThrow();
        user.setUserName(updateUser.getUserName());
        user.setFirstName(updateUser.getFirstName());
        user.setPassword(updateUser.getPassword());
        user.setEmail(updateUser.getEmail());
        userRepository.save(user);
        return user;
    }

    // Add Deal
    @PutMapping("/addDealId")
    public ResponseEntity<?> addDealId(@RequestBody DealAdder dealAdder) {

        UserModel user = userRepository.findById(dealAdder.getUserId()).orElseThrow();
        user.addDealId(dealAdder.getDealId());
        userRepository.save(user);
        return ResponseEntity.ok(new RequestResponse("Deal added to the User Account!\nDeal id:" + dealAdder.getDealId()
                + "\nUser Id:" + dealAdder.getUserId()));

    }

    // Add Coupon
    @PutMapping("/addCouponId")
    public ResponseEntity<?> addCouponId(@RequestBody CouponAdder couponAdder) {
        UserModel user = userRepository.findById(couponAdder.getCouponId()).orElseThrow();
        user.addCouponId(couponAdder.getCouponId());
        userRepository.save(user);
        return ResponseEntity.ok(new RequestResponse("Coupon added to the User Account!\nCoupon id:"
                + couponAdder.getCouponId() + "\nUser Id:" + couponAdder.getUserId()));

    }

}
