package deals.couponsmanager.Service;

import org.springframework.stereotype.Service;

import deals.couponsmanager.Models.UserModel;

@Service
public class CouponsService {

    public boolean isValidUser(int id) {
        return true;
    }

    public UserModel userModelServer(int id) {
        return new UserModel(1, "shirdi", "k", "s", "s", "s", "s", true, 100.0);
    }

    public boolean rewardsReducer(int userId, double rewards) {
        return true;
    }
}
