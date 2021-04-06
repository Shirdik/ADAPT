package deals.couponsmanager.Models;

public class RewardsRequest {
    private int userId;
    private double rewards;

    public RewardsRequest() {
    }

    public RewardsRequest(int userId, double rewards) {
        this.userId = userId;
        this.rewards = rewards;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getRewards() {
        return rewards;
    }

    public void setRewards(double rewards) {
        this.rewards = rewards;
    }

}
