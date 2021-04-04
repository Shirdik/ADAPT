package deals.dealsmanager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import deals.dealsmanager.Models.UserModel;

@RestController
public class DealsController {

    @Autowired
    RestTemplate restTemplate;

    // Home
    @RequestMapping("/")
    public String home() {
        return "<h1>Welcome!</h1>";
    }

    // User Page
    @RequestMapping("/user")
    public String user() {
        return "<h1>Welcome user!</h1>";
    }

    // Admin Page
    @RequestMapping("/admin")
    public String admin() {
        return "<h1>Welcome admin!</h1>";
    }

    @RequestMapping("/authapp")
    public UserModel authapp() {
        return restTemplate.getForObject("http://auth-application/allUsers/1", UserModel.class);
    }

}