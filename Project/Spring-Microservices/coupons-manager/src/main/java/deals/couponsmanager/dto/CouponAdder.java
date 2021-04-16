package deals.couponsmanager.dto;

public class CouponAdder {

    private String username;
    private String couponCode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public CouponAdder() {
    }

    public CouponAdder(String username, String couponCode) {
        this.username = username;
        this.couponCode = couponCode;
    }

}
