package login.auth.Models;

public class CouponAdder {

    private int userId;
    private int couponId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    public CouponAdder(int userId, int dealId) {
        this.userId = userId;
        this.couponId = dealId;
    }

    public CouponAdder() {
    }
}
