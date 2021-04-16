package login.auth.dto;

public class DealAdder {

    private String username;
    private String dealCode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDealCode() {
        return dealCode;
    }

    public void setDealCode(String dealCode) {
        this.dealCode = dealCode;
    }

    public DealAdder(String username, String dealCode) {
        this.username = username;
        this.dealCode = dealCode;
    }

    public DealAdder() {

    }

}
