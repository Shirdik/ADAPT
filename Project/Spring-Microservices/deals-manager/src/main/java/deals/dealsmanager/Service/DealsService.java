package deals.dealsmanager.Service;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import deals.dealsmanager.Models.UserModel;

@Service
public class DealsService {

    @Autowired
    RestTemplate restTemplate;

    public boolean isValidUser(int id) {
        UserModel user = restTemplate.getForObject("http://auth-application/allUsers/" + id, UserModel.class);

        return (user != null);
    }

    public UserModel userModelServer(int id) {
        return restTemplate.getForObject("http://auth-application/allUsers/" + id, UserModel.class);
    }

    public boolean rewardsAdder(int userId, double rewards) {
        restTemplate.getForObject("http://rewards-manager//user/addRewards" + userId + "/" + rewards,
                ResponseEntity.class);
        return true;
    }
}
