package deals.couponsmanager.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class CouponsModelTest {
    @Test
    public void testAddUsername() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   To help Diffblue Cover to find assertions, please add getters to the
        //   class under test that return fields written by the method under test.
        //   See https://diff.blue/R004

        (new CouponsModel()).addUsername("janedoe");
    }

    @Test
    public void testAddUsername2() {
        CouponsModel couponsModel = new CouponsModel();
        couponsModel.setUsernames(new HashSet<String>());
        couponsModel.addUsername("janedoe");
        assertEquals(1, couponsModel.getUsernames().size());
    }

    @Test
    public void testAddUsername3() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   To help Diffblue Cover to find assertions, please add getters to the
        //   class under test that return fields written by the method under test.
        //   See https://diff.blue/R004

        (new CouponsModel()).addUsername("janedoe");
    }

    @Test
    public void testAddUsername4() {
        CouponsModel couponsModel = new CouponsModel();
        couponsModel.setUsernames(new HashSet<String>());
        couponsModel.addUsername("janedoe");
        assertEquals(1, couponsModel.getUsernames().size());
    }

    @Test
    public void testConstructor() {
        CouponsModel actualCouponsModel = new CouponsModel();
        assertNull(actualCouponsModel.getCategory());
        assertNull(actualCouponsModel.getTitle());
        assertEquals(0.0, actualCouponsModel.getRewards());
        assertNull(actualCouponsModel.getLink());
        assertNull(actualCouponsModel.getImageurl());
        assertNull(actualCouponsModel.getDescription());
        assertNull(actualCouponsModel.getCouponCode());
    }

    @Test
    public void testConstructor2() {
        CouponsModel actualCouponsModel = new CouponsModel();
        assertNull(actualCouponsModel.getCategory());
        assertNull(actualCouponsModel.getTitle());
        assertEquals(0.0, actualCouponsModel.getRewards());
        assertNull(actualCouponsModel.getLink());
        assertNull(actualCouponsModel.getImageurl());
        assertNull(actualCouponsModel.getDescription());
        assertNull(actualCouponsModel.getCouponCode());
    }

    @Test
    public void testSetTitle() {
        CouponsModel couponsModel = new CouponsModel();
        couponsModel.setTitle("Dr");
        assertEquals("Dr", couponsModel.getTitle());
    }

    @Test
    public void testSetTitle2() {
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
    public void testSetDescription2() {
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
    public void testSetImageurl2() {
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
    public void testSetLink2() {
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
    public void testSetRewards2() {
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
    public void testSetCouponCode2() {
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
    public void testSetUsernames2() {
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

    @Test
    public void testSetCategory2() {
        CouponsModel couponsModel = new CouponsModel();
        couponsModel.setCategory("Category");
        assertEquals("Category", couponsModel.getCategory());
    }
}

