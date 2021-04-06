package deals.dealsmanager.Models;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "deals")
public class DealsModel {

    @Id
    private int id;
    private String title;
    private String description;
    private String imageurl;
    private String link;
    private Set<Integer> userIds;
    private double rewards;
    private Set<Category> Category;

    // Methods
    public void addUserId(int userId) {
        this.userIds.add(userId);
    }

    public void addCategory(Set<Category> categories) {
        this.Category.addAll(categories);
    }

    // Constructor
    public DealsModel() {
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Set<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(Set<Integer> userIds) {
        this.userIds = userIds;
    }

    public double getRewards() {
        return rewards;
    }

    public void setRewards(double rewards) {
        this.rewards = rewards;
    }

    public Set<Category> getCategory() {
        return Category;
    }

    public void setCategory(Set<Category> category) {
        Category = category;
    }

}
