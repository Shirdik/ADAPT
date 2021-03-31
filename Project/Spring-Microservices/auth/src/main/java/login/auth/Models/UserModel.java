package login.auth.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class UserModel {

    @Id
    private int _id;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String authority;
    private Boolean active;
    private Double rewards;

    public UserModel() {
    }

    public int getId() {
        return _id;
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

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
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

    @Override
    public String toString() {
        return "User [active=" + active + ", authority=" + authority + ", email=" + email + ", firstName=" + firstName
                + ", id=" + _id + ", lastName=" + lastName + ", password=" + password + ", rewards=" + rewards
                + ", username=" + username + "]";
    }

}
