package deals.dealsmanager.dto;

public class RewardsRequest {
    private String username;
    private double rewards;

    public RewardsRequest() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getRewards() {
        return rewards;
    }

    public void setRewards(double rewards) {
        this.rewards = rewards;
    }

    public RewardsRequest(String username, double rewards) {
        this.username = username;
        this.rewards = rewards;
    }

}
