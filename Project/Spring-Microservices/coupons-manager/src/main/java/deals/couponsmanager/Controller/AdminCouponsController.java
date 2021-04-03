package deals.couponsmanager.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deals.couponsmanager.Models.CouponsModel;
import deals.couponsmanager.Service.CouponsRepository;

@RestController
@RequestMapping("/admin")
public class AdminCouponsController {

    @Autowired
    CouponsRepository couponsRepository;

    @PostMapping("/addCoupon")
    public ResponseEntity<?> addDeal(@RequestBody CouponsModel coupon) {
        couponsRepository.save(coupon);
        return ResponseEntity.ok("Added Coupon to the database:" + coupon.getTitle());
    }

    @GetMapping("/allCoupons")
    public List<CouponsModel> allDeals() {
        return couponsRepository.findAll();
    }

    @GetMapping("/allCoupons/{id}")
    public Optional<CouponsModel> allCoupon(@PathVariable int id) {
        return couponsRepository.findById(id);
    }

    @DeleteMapping("/removeCoupon/{id}")
    public ResponseEntity<?> removeCoupon(@PathVariable int id) {
        couponsRepository.deleteById(id);
        return ResponseEntity.ok("Removed Coupon from the database with id:" + id);
    }

}
