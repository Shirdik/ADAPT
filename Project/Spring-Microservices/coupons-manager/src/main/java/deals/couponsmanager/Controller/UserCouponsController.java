package deals.couponsmanager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import deals.couponsmanager.dto.CouponAdder;
import deals.couponsmanager.Models.CouponsModel;
import deals.couponsmanager.dto.RequestResponse;
import deals.couponsmanager.Service.CouponsRepository;
import deals.couponsmanager.Service.CouponsService;

@RestController
@RequestMapping("/user")
public class UserCouponsController extends CouponsService {

    @Autowired
    CouponsRepository couponsRepository;

    @Autowired
    RestTemplate restTemplate;

    @PutMapping("/grabCoupon/{username}/{couponCode}")
    public ResponseEntity<?> grabCoupon(@PathVariable String couponCode, @PathVariable String username)
            throws UsernameNotFoundException {
        if (isValidUser(username)) {

            CouponsModel coupon = couponsRepository.findById(couponCode).orElseThrow();
            if (!coupon.getUsernames().contains(username)) {

                // Adding User to the Coupon
                coupon.addUsername(username);
                restTemplate.put("https://auth-application/addCouponCode", new CouponAdder(username, couponCode));
                rewardsReducer(username, coupon.getRewards());

            } else
                return ResponseEntity.ok(new RequestResponse("UserId: " + username + "is already in the List"));
            couponsRepository.save(coupon);
            // Adding Rewards in the User Account
            return ResponseEntity.ok("Coupon Added!:" + couponCode);

            // If Rewards are not added in the User Account
            // return ResponseEntity.ok("Couldn't reduce Rewards in the User Account with
            // id:" + couponId);

        }
        // If the User id is not valid or the user is not found!
        return ResponseEntity.ok("User Not Found! with id:" + couponCode);
    }

}
