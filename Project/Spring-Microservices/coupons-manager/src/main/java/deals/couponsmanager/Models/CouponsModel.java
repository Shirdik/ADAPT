package deals.couponsmanager.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "coupons")
public class CouponsModel {

    @Id
    private int id;
    private String title;
    private String description;
    private String imageurl;
    private String link;
    private List<UserModel> users;
    private double rewards;
    private String Category;

    public CouponsModel() {
    }

    public CouponsModel(int id) {
        this.id = id;
    }

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

    public List<UserModel> getUsers() {
        return users;
    }

    public void setUsers(List<UserModel> users) {
        this.users = users;
    }

    public void addUser(UserModel user) {
        this.users.add(user);
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

    public CouponsModel(int id, String title, String description, String imageurl, String link, List<UserModel> users,
            double rewards, String category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageurl = imageurl;
        this.link = link;
        this.users = users;
        this.rewards = rewards;
        Category = category;
    }

}
