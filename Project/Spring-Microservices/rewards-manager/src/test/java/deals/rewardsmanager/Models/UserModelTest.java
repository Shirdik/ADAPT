package deals.rewardsmanager.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class UserModelTest {
    @Test
    public void testSetUsername() {
        UserModel userModel = new UserModel(1);
        userModel.setUsername("janedoe");
        assertEquals("janedoe", userModel.getUsername());
    }

    @Test
    public void testSetFirstName() {
        UserModel userModel = new UserModel(1);
        userModel.setFirstName("Jane");
        assertEquals("Jane", userModel.getFirstName());
    }

    @Test
    public void testSetLastName() {
        UserModel userModel = new UserModel(1);
        userModel.setLastName("Doe");
        assertEquals("Doe", userModel.getLastName());
    }

    @Test
    public void testSetPassword() {
        UserModel userModel = new UserModel(1);
        userModel.setPassword("iloveyou");
        assertEquals("iloveyou", userModel.getPassword());
    }

    @Test
    public void testSetEmail() {
        UserModel userModel = new UserModel(1);
        userModel.setEmail("jane.doe@example.org");
        assertEquals("jane.doe@example.org", userModel.getEmail());
    }

    @Test
    public void testSetActive() {
        UserModel userModel = new UserModel(1);
        userModel.setActive(true);
        assertTrue(userModel.getActive());
    }

    @Test
    public void testSetRewards() {
        UserModel userModel = new UserModel(1);
        userModel.setRewards(10.0);
        assertEquals(10.0, userModel.getRewards().doubleValue());
    }

    @Test
    public void testToString() {
        assertEquals("User [active=null, authority=null, email=null, firstName=null, id=1, lastName=null, password=null,"
                + " rewards=null, username=null]", (new UserModel(1)).toString());
    }

    @Test
    public void testSetRoles() {
        UserModel userModel = new UserModel(1);
        userModel.setRoles("Roles");
        assertEquals("Roles", userModel.getRoles());
    }

    @Test
    public void testSetUserName() {
        UserModel userModel = new UserModel(1);
        userModel.setUserName("janedoe");
        assertEquals("janedoe", userModel.getUsername());
    }

    @Test
    public void testSetDealIds() {
        UserModel userModel = new UserModel(1);
        HashSet<Integer> integerSet = new HashSet<Integer>();
        userModel.setDealIds(integerSet);
        assertSame(integerSet, userModel.getDealIds());
    }

    @Test
    public void testSetCouponIds() {
        UserModel userModel = new UserModel(1);
        HashSet<Integer> integerSet = new HashSet<Integer>();
        userModel.setCouponIds(integerSet);
        assertSame(integerSet, userModel.getCouponIds());
    }

    @Test
    public void testAddDealId() {
        UserModel userModel = new UserModel(1);
        userModel.setDealIds(new HashSet<Integer>());
        userModel.addDealId(123);
        userModel.addDealId(123);
        assertEquals(1, userModel.getDealIds().size());
    }

    @Test
    public void testAddCouponId() {
        UserModel userModel = new UserModel(1);
        userModel.setCouponIds(new HashSet<Integer>());
        userModel.addCouponId(123);
        assertEquals(1, userModel.getCouponIds().size());
    }
}

