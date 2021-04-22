package login.auth.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class UserModelTest {
    @Test
    public void testConstructor() {
        UserModel actualUserModel = new UserModel();
        assertTrue(actualUserModel.getActive());
        assertEquals("ROLE_USER", actualUserModel.getRoles());
    }

    @Test
    public void testConstructor2() {
        UserModel actualUserModel = new UserModel();
        assertTrue(actualUserModel.getActive());
        assertEquals("ROLE_USER", actualUserModel.getRoles());
    }

    @Test
    public void testSetFirstName() {
        UserModel userModel = new UserModel();
        userModel.setFirstName("Jane");
        assertEquals("Jane", userModel.getFirstName());
    }

    @Test
    public void testSetFirstName2() {
        UserModel userModel = new UserModel();
        userModel.setFirstName("Jane");
        assertEquals("Jane", userModel.getFirstName());
    }

    @Test
    public void testSetLastName() {
        UserModel userModel = new UserModel();
        userModel.setLastName("Doe");
        assertEquals("Doe", userModel.getLastName());
    }

    @Test
    public void testSetLastName2() {
        UserModel userModel = new UserModel();
        userModel.setLastName("Doe");
        assertEquals("Doe", userModel.getLastName());
    }

    @Test
    public void testSetPassword() {
        UserModel userModel = new UserModel();
        userModel.setPassword("iloveyou");
        assertEquals("iloveyou", userModel.getPassword());
    }

    @Test
    public void testSetPassword2() {
        UserModel userModel = new UserModel();
        userModel.setPassword("iloveyou");
        assertEquals("iloveyou", userModel.getPassword());
    }

    @Test
    public void testSetEmail() {
        UserModel userModel = new UserModel();
        userModel.setEmail("jane.doe@example.org");
        assertEquals("jane.doe@example.org", userModel.getEmail());
    }

    @Test
    public void testSetEmail2() {
        UserModel userModel = new UserModel();
        userModel.setEmail("jane.doe@example.org");
        assertEquals("jane.doe@example.org", userModel.getEmail());
    }

    @Test
    public void testSetActive() {
        UserModel userModel = new UserModel();
        userModel.setActive(true);
        assertTrue(userModel.getActive());
    }

    @Test
    public void testSetActive2() {
        UserModel userModel = new UserModel();
        userModel.setActive(true);
        assertTrue(userModel.getActive());
    }

    @Test
    public void testSetRoles() {
        UserModel userModel = new UserModel();
        userModel.setRoles("Roles");
        assertEquals("Roles", userModel.getRoles());
    }

    @Test
    public void testSetRoles2() {
        UserModel userModel = new UserModel();
        userModel.setRoles("Roles");
        assertEquals("Roles", userModel.getRoles());
    }

    @Test
    public void testSetUserName() {
        UserModel userModel = new UserModel();
        userModel.setUserName("janedoe");
        assertEquals("janedoe", userModel.getUserName());
    }

    @Test
    public void testSetUserName2() {
        UserModel userModel = new UserModel();
        userModel.setUserName("janedoe");
        assertEquals("janedoe", userModel.getUserName());
    }

    @Test
    public void testAddDealCode() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   To help Diffblue Cover to find assertions, please add getters to the
        //   class under test that return fields written by the method under test.
        //   See https://diff.blue/R004

        (new UserModel()).addDealCode("42");
    }

    @Test
    public void testAddDealCode2() {
        UserModel userModel = new UserModel();
        userModel.setDealCodes(new HashSet<String>());
        userModel.addDealCode("42");
        assertEquals(1, userModel.getDealCodes().size());
    }

    @Test
    public void testAddDealCode3() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   To help Diffblue Cover to find assertions, please add getters to the
        //   class under test that return fields written by the method under test.
        //   See https://diff.blue/R004

        (new UserModel()).addDealCode("42");
    }

    @Test
    public void testAddDealCode4() {
        UserModel userModel = new UserModel();
        userModel.setDealCodes(new HashSet<String>());
        userModel.addDealCode("42");
        assertEquals(1, userModel.getDealCodes().size());
    }

    @Test
    public void testAddCouponCode() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   To help Diffblue Cover to find assertions, please add getters to the
        //   class under test that return fields written by the method under test.
        //   See https://diff.blue/R004

        (new UserModel()).addCouponCode("42");
    }

    @Test
    public void testAddCouponCode2() {
        UserModel userModel = new UserModel();
        userModel.setCouponCodes(new HashSet<String>());
        userModel.addCouponCode("42");
        assertEquals(1, userModel.getCouponCodes().size());
    }

    @Test
    public void testAddCouponCode3() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   To help Diffblue Cover to find assertions, please add getters to the
        //   class under test that return fields written by the method under test.
        //   See https://diff.blue/R004

        (new UserModel()).addCouponCode("42");
    }

    @Test
    public void testAddCouponCode4() {
        UserModel userModel = new UserModel();
        userModel.setCouponCodes(new HashSet<String>());
        userModel.addCouponCode("42");
        assertEquals(1, userModel.getCouponCodes().size());
    }

    @Test
    public void testSetDealCodes() {
        UserModel userModel = new UserModel();
        HashSet<String> stringSet = new HashSet<String>();
        userModel.setDealCodes(stringSet);
        assertSame(stringSet, userModel.getDealCodes());
    }

    @Test
    public void testSetDealCodes2() {
        UserModel userModel = new UserModel();
        HashSet<String> stringSet = new HashSet<String>();
        userModel.setDealCodes(stringSet);
        assertSame(stringSet, userModel.getDealCodes());
    }

    @Test
    public void testSetCouponCodes() {
        UserModel userModel = new UserModel();
        HashSet<String> stringSet = new HashSet<String>();
        userModel.setCouponCodes(stringSet);
        assertSame(stringSet, userModel.getCouponCodes());
    }

    @Test
    public void testSetCouponCodes2() {
        UserModel userModel = new UserModel();
        HashSet<String> stringSet = new HashSet<String>();
        userModel.setCouponCodes(stringSet);
        assertSame(stringSet, userModel.getCouponCodes());
    }
}

