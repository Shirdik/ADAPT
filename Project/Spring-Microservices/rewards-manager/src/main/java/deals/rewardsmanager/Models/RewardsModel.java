package deals.rewardsmanager.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rewards")
public class RewardsModel {
    @Id
    private int userId;
    private double rewards;

    public RewardsModel() {
    }

    public RewardsModel(int userId, double rewards) {
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
