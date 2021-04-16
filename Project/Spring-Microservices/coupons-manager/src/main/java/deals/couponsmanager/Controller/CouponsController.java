package deals.couponsmanager.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deals.couponsmanager.Models.CouponsModel;
import deals.couponsmanager.Service.CouponsRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
// Public Page
public class CouponsController {

    @Autowired
    CouponsRepository couponsRepository;

    // Home
    @RequestMapping("/")
    public String home() {
        return "<h1>Welcome to Coupons-Manager!</h1>";
    }

    // User Page
    @RequestMapping("/user")
    public String user() {
        return "<h1>Welcome to Coupons-Manager user!</h1>";
    }

    // Admin Page
    @RequestMapping("/admin")
    public String admin() {
        return "<h1>Welcome to Coupons-Manager admin!</h1>";
    }

    // For Showing list of Deals on the webpage
    // Should be accessed by everyone. So, in Public Page
    @GetMapping("/allCoupons")
    public List<CouponsModel> allDeals() {
        return couponsRepository.findAll();
    }

    // For Validation and Retrival of Coupon for the auth applicatiion
    // Should be accessed by everyone while searching
    @GetMapping("/allCoupons/{couponCode}")
    public Optional<CouponsModel> allCoupon(@PathVariable String couponCode) {
        return couponsRepository.findById(couponCode);
    }
}
