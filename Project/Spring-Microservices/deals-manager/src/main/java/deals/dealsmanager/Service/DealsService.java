package deals.dealsmanager.Service;

import org.springframework.stereotype.Service;

import deals.dealsmanager.Models.UserModel;

@Service
public class DealsService {

    public boolean isValidUser(int id) {
        return true;
    }

    public UserModel userModelServer(int id) {
        return new UserModel();
    }

    public boolean rewardsAdder(int userId, double rewards) {
        return true;
    }
}
