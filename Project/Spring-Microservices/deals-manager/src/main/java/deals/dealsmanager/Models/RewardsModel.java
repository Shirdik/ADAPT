package deals.dealsmanager.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rewards")
public class RewardsModel {
    @Id
    private String username;
    private double rewards;

    public RewardsModel() {
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

    public RewardsModel(String username, double rewards) {
        this.username = username;
        this.rewards = rewards;
    }

}
