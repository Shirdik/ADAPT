package login.auth.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class CouponsModelTest {
    @Test
    public void testAddUsername() {
        CouponsModel couponsModel = new CouponsModel();
        couponsModel.setUsernames(new HashSet<String>());
        couponsModel.addUsername("janedoe");
        couponsModel.addUsername("janedoe");
        assertEquals(1, couponsModel.getUsernames().size());
    }

    @Test
    public void testSetTitle() {
        CouponsModel couponsModel = new CouponsModel();
        couponsModel.setTitle("Dr");
        assertEquals("Dr", couponsModel.getTitle());
    }

    @Test
    public void testSetDescription() {
        CouponsModel couponsModel = new CouponsModel();
        couponsModel.setDescription("The characteristics of someone or something");
        assertEquals("The characteristics of someone or something", couponsModel.getDescription());
    }

    @Test
    public void testSetImageurl() {
        CouponsModel couponsModel = new CouponsModel();
        couponsModel.setImageurl("https://example.org/example");
        assertEquals("https://example.org/example", couponsModel.getImageurl());
    }

    @Test
    public void testSetLink() {
        CouponsModel couponsModel = new CouponsModel();
        couponsModel.setLink("Link");
        assertEquals("Link", couponsModel.getLink());
    }

    @Test
    public void testSetRewards() {
        CouponsModel couponsModel = new CouponsModel();
        couponsModel.setRewards(10.0);
        assertEquals(10.0, couponsModel.getRewards());
    }

    @Test
    public void testSetCouponCode() {
        CouponsModel couponsModel = new CouponsModel();
        couponsModel.setCouponCode("Coupon Code");
        assertEquals("Coupon Code", couponsModel.getCouponCode());
    }

    @Test
    public void testSetUsernames() {
        CouponsModel couponsModel = new CouponsModel();
        HashSet<String> stringSet = new HashSet<String>();
        couponsModel.setUsernames(stringSet);
        assertSame(stringSet, couponsModel.getUsernames());
    }

    @Test
    public void testSetCategory() {
        CouponsModel couponsModel = new CouponsModel();
        couponsModel.setCategory("Category");
        assertEquals("Category", couponsModel.getCategory());
    }
}

