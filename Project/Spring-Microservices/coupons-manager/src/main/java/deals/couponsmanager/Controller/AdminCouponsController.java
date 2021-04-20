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
import deals.couponsmanager.dto.RequestResponse;
import deals.couponsmanager.Service.CouponsRepository;

@RestController
@RequestMapping("/admin")
public class AdminCouponsController {

    @Autowired
    CouponsRepository couponsRepository;

    // Add Coupon
    @PostMapping("/addCoupon")
    public ResponseEntity<?> addDeal(@RequestBody CouponsModel coupon) {
        couponsRepository.save(coupon);
        return ResponseEntity.ok(new RequestResponse("Added Coupon to the database:" + coupon.getCouponCode()));
    }

    // Edit Coupon
    @PutMapping("/editCoupon")
    public ResponseEntity<?> editDeal(@RequestBody CouponsModel updatedCoupon) {
        CouponsModel deal = couponsRepository.findById(updatedCoupon.getCouponCode()).orElseThrow();
        deal.setTitle(updatedCoupon.getTitle());
        deal.setCouponCode(updatedCoupon.getCouponCode());
        deal.setDescription(updatedCoupon.getDescription());
        deal.setImageurl(updatedCoupon.getImageurl());
        deal.setLink(updatedCoupon.getLink());
        deal.setRewards(updatedCoupon.getRewards());
        deal.setCategory(updatedCoupon.getCategory());
        couponsRepository.save(deal);
        return ResponseEntity.ok(new RequestResponse("Updated Deal" + deal.getTitle()));
    }

    // Remove Coupon
    @DeleteMapping("/removeCoupon/{couponCode}")
    public ResponseEntity<?> removeCoupon(@PathVariable String couponCode) {

        couponsRepository.deleteById(couponCode);
        return ResponseEntity.ok(new RequestResponse("Removed Coupon from the database with couponCode" + couponCode));
    }

}
