package deals.dealsmanager.Models;

import java.util.List;

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
    private List<Integer> userIds;
    private double rewards;
    private String Category;

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

    public DealsModel() {
    }

    public DealsModel(int id, String title, String description, String imageurl, String link, List<Integer> users) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageurl = imageurl;
        this.link = link;
        this.userIds = users;
    }

    public DealsModel(int id) {
        this.id = id;
    }

    public void addUserId(int userId) {
        this.userIds.add(userId);
    }

    public double getRewards() {
        return rewards;
    }

    public void setRewards(double rewards) {
        this.rewards = rewards;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

}
