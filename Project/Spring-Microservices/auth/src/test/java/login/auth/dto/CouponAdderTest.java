package login.auth.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CouponAdderTest {
    @Test
    public void testSetUsername() {
        CouponAdder couponAdder = new CouponAdder("janedoe", "Coupon Code");
        couponAdder.setUsername("janedoe");
        assertEquals("janedoe", couponAdder.getUsername());
    }

    @Test
    public void testSetCouponCode() {
        CouponAdder couponAdder = new CouponAdder("janedoe", "Coupon Code");
        couponAdder.setCouponCode("Coupon Code");
        assertEquals("Coupon Code", couponAdder.getCouponCode());
    }
}

