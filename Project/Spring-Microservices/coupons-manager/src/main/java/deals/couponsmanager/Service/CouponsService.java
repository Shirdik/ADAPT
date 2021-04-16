package deals.couponsmanager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import deals.couponsmanager.dto.RewardsRequest;
import deals.couponsmanager.Models.UserModel;

@Service
public class CouponsService {

    @Autowired
    RestTemplate restTemplate;

    public boolean isValidUser(String username) {

        if (restTemplate.getForObject("https://auth-application/allUsers/" + username, UserModel.class) == null)
            return false;
        return true;
    }

    public void rewardsReducer(String username, double rewards) {
        restTemplate.put("https://rewards-manager/user/reduceRewards", new RewardsRequest(username, rewards));
    }
}
