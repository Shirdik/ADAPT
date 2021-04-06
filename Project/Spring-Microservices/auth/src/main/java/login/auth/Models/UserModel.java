package login.auth.Models;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class UserModel {

    @Id
    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String roles;
    private Boolean active;
    private Double rewards;
    private Set<Integer> dealIds;
    private Set<Integer> couponIds;

    public UserModel() {
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Double getRewards() {
        return rewards;
    }

    public void setRewards(Double rewards) {
        this.rewards = rewards;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public UserModel(int id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public Set<Integer> getDealIds() {
        return dealIds;
    }

    public void setDealIds(Set<Integer> dealIds) {
        this.dealIds = dealIds;
    }

    public Set<Integer> getCouponIds() {
        return couponIds;
    }

    public void setCouponIds(Set<Integer> couponIds) {
        this.couponIds = couponIds;
    }

    public void addDealId(int dealId) {
        this.dealIds.add(dealId);
    }

    public void addCouponId(int couponId) {
        this.couponIds.add(couponId);
    }
}
