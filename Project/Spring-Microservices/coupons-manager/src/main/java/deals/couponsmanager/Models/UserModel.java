package deals.couponsmanager.Models;

import java.util.Set;

public class UserModel {

    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String roles;
    private Boolean active;
    private Double rewards;
    private Set<String> dealCodes;
    private Set<String> couponCodes;

    public UserModel() {
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

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public void addDealCode(String dealId) {
        this.dealCodes.add(dealId);
    }

    public void addCouponCode(String couponId) {
        this.couponCodes.add(couponId);
    }

    public Set<String> getDealCodes() {
        return dealCodes;
    }

    public void setDealCodes(Set<String> dealCodes) {
        this.dealCodes = dealCodes;
    }

    public Set<String> getCouponCodes() {
        return couponCodes;
    }

    public void setCouponCodes(Set<String> couponCodes) {
        this.couponCodes = couponCodes;
    }
}
