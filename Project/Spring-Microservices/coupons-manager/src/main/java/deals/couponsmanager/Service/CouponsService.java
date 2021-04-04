package deals.couponsmanager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import deals.couponsmanager.Models.UserModel;

@Service
public class CouponsService {

    @Autowired
    RestTemplate restTemplate;

    public boolean isValidUser(int id) {

        if (restTemplate.getForObject("https://auth-application/allUsers/" + id, UserModel.class) == null)
            return false;
        return true;
    }

    public void rewardsReducer(int userId, double rewards) {
        restTemplate.getForObject("https://rewards-application/user/" + userId + "/" + rewards, ResponseEntity.class);
    }
}
