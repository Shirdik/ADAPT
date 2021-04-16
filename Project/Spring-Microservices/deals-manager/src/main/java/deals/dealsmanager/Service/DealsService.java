package deals.dealsmanager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import deals.dealsmanager.Models.UserModel;

@Service
public class DealsService {

    @Autowired
    RestTemplate restTemplate;

    public boolean isValidUser(String username) {
        UserModel user = restTemplate.getForObject("http://auth-application/allUsers/" + username, UserModel.class);
        return (user != null);
    }

    public void rewardsAdder(String username, double rewards) {
        restTemplate.put("https://rewards-manager/user/addRewards",
                new deals.dealsmanager.dto.RewardsRequest(username, rewards));

    }

}
