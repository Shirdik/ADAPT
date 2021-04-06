package deals.dealsmanager.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import deals.dealsmanager.Models.DealsModel;
import deals.dealsmanager.Models.UserModel;
import deals.dealsmanager.Service.DealsRepository;

@RestController
public class DealsController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DealsRepository dealsRepository;

    // Home
    @RequestMapping("/")
    public String home() {
        return "<h1>Welcome to Deals-Manager!</h1>";
    }

    // User Page
    @RequestMapping("/user")
    public String user() {
        return "<h1>Welcome to Deals-Manager user!</h1>";
    }

    // Admin Page
    @RequestMapping("/admin")
    public String admin() {
        return "<h1>Welcome to Deals-Manager admin!</h1>";
    }

    // Get All Deals
    @GetMapping("/allDeals")
    public List<DealsModel> allDeals() {
        return dealsRepository.findAll();
    }

    // Get Deal by Id
    @GetMapping("/allDeals/{id}")
    public Optional<DealsModel> allDeal(@PathVariable int id) {
        return dealsRepository.findById(id);
    }

    // Test for Eureka Server-Client Connection!
    @RequestMapping("/authapp")
    public UserModel authapp() {
        return restTemplate.getForObject("http://auth-application/admin/allUsers/1", UserModel.class);
    }

}