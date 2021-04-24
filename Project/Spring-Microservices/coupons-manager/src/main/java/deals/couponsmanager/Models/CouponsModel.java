package deals.couponsmanager.Models;

import java.util.Collections;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "coupons")
public class CouponsModel {

    @Id
    private String couponCode;
    private String title;
    private String description;
    private String imageurl;
    private String link;
    private Set<String> usernames;
    private double rewards;
    private String category;

    // Methods
    public void addUsername(String username) {
        this.usernames.add(username);
    }

    // Constructor
    public CouponsModel() {
        this.usernames = Collections.emptySet();
    }

    // Getters and Setters

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

    public double getRewards() {
        return rewards;
    }

    public void setRewards(double rewards) {
        this.rewards = rewards;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public CouponsModel(String couponCode, String title, String description, String imageurl, String link,
            double rewards, String category) {
        this.couponCode = couponCode;
        this.title = title;
        this.description = description;
        this.imageurl = imageurl;
        this.link = link;
        this.rewards = rewards;
        this.category = category;
        this.usernames = Collections.emptySet();
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Set<String> getUsernames() {
        return usernames;
    }

    public void setUsernames(Set<String> usernames) {
        this.usernames = usernames;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
