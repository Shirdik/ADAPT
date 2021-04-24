package deals.couponsmanager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deals.couponsmanager.Models.CouponsModel;
import deals.couponsmanager.dto.RequestModel;
import deals.couponsmanager.dto.RequestResponse;
import deals.couponsmanager.Service.CouponsRepository;

@RestController
@RequestMapping("/admin")
public class AdminCouponsController {

    @Autowired
    CouponsRepository couponsRepository;

    // Add Coupon
    @PostMapping("/addCoupon")
    public ResponseEntity<?> addDeal(@RequestBody RequestModel coupon) {
        couponsRepository.save(new CouponsModel(coupon.getCode(), coupon.getTitle(), coupon.getDescription(),
                coupon.getImageurl(), coupon.getLink(), coupon.getRewards(), coupon.getCategory()));
        return ResponseEntity.ok(new RequestResponse("Added Coupon to the database:" + coupon.getCode()));
    }

    // Edit Coupon
    @PutMapping("/editCoupon")
    public ResponseEntity<?> editDeal(@RequestBody CouponsModel updatedCoupon) {
        CouponsModel coupon = couponsRepository.findById(updatedCoupon.getCouponCode()).orElseThrow();
        if (updatedCoupon.getTitle() != "")
            coupon.setTitle(updatedCoupon.getTitle());
        if (updatedCoupon.getCouponCode() != "")
            coupon.setCouponCode(updatedCoupon.getCouponCode());
        if (updatedCoupon.getDescription() != "")
            coupon.setDescription(updatedCoupon.getDescription());
        if (updatedCoupon.getImageurl() != "")
            coupon.setImageurl(updatedCoupon.getImageurl());
        if (updatedCoupon.getLink() != "")
            coupon.setLink(updatedCoupon.getLink());
        if (updatedCoupon.getRewards() != 0)
            coupon.setRewards(updatedCoupon.getRewards());
        if (updatedCoupon.getCategory() != "")
            coupon.setCategory(updatedCoupon.getCategory());
        couponsRepository.save(coupon);
        return ResponseEntity.ok(new RequestResponse("Updated Deal" + coupon.getTitle()));
    }

    // Remove Coupon
    @DeleteMapping("/removeCoupon/{couponCode}")
    public ResponseEntity<?> removeCoupon(@PathVariable String couponCode) {

        couponsRepository.deleteById(couponCode);
        return ResponseEntity.ok(new RequestResponse("Removed Coupon from the database with couponCode" + couponCode));
    }

}
