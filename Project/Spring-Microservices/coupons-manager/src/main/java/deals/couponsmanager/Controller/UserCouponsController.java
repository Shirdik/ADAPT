package deals.couponsmanager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import deals.couponsmanager.Models.CouponAdder;
import deals.couponsmanager.Models.CouponsModel;
import deals.couponsmanager.Models.RequestResponse;
import deals.couponsmanager.Service.CouponsRepository;
import deals.couponsmanager.Service.CouponsService;

@RestController
@RequestMapping("/user")
public class UserCouponsController extends CouponsService {

    @Autowired
    CouponsRepository couponsRepository;

    @Autowired
    RestTemplate restTemplate;

    @PutMapping("/grabCoupon/{userId}/{couponId}")
    public ResponseEntity<?> grabCoupon(@PathVariable int couponId, @PathVariable int userId)
            throws UsernameNotFoundException {
        if (isValidUser(userId)) {

            CouponsModel coupon = couponsRepository.findById(couponId).orElseThrow();
            if (!coupon.getUserIds().contains(userId)) {

                // Adding User to the Coupon
                coupon.addUserId(userId);
                restTemplate.put("https://auth-application/user/addCouponId", new CouponAdder(userId, couponId));

            } else
                return ResponseEntity.ok(new RequestResponse("UserId: " + userId + "is already in the List"));
            couponsRepository.save(coupon);
            // Adding Rewards in the User Account
            rewardsReducer(userId, coupon.getRewards());
            return ResponseEntity.ok("Coupon Added!:" + couponId);

            // If Rewards are not added in the User Account
            // return ResponseEntity.ok("Couldn't reduce Rewards in the User Account with
            // id:" + couponId);

        }
        // If the User id is not valid or the user is not found!
        return ResponseEntity.ok("User Not Found! with id:" + couponId);
    }

}
