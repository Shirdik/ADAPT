package deals.dealsmanager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import deals.dealsmanager.Models.RewardsRequest;
import deals.dealsmanager.Models.UserModel;

@Service
public class DealsService {

    @Autowired
    RestTemplate restTemplate;

    public boolean isValidUser(int id) {
        UserModel user = restTemplate.getForObject("http://auth-application/allUsers/" + id, UserModel.class);
        return (user != null);
    }

    public void rewardsAdder(int userId, double rewards) {
        restTemplate.put("https://rewards-manager/user/addRewards", new RewardsRequest(userId, rewards));

    }

}
