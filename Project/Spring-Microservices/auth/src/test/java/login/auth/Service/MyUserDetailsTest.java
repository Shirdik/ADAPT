package login.auth.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import login.auth.Models.UserModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.GrantedAuthority;

public class MyUserDetailsTest {
    @MockBean
    private UserRepository userRepository;

    @Test
    public void testConstructor() {
        MyUserDetails actualMyUserDetails = new MyUserDetails(new UserModel());
        assertTrue(actualMyUserDetails.isEnabled());
        assertNull(actualMyUserDetails.getPassword());
        assertNull(actualMyUserDetails.getUsername());
        assertEquals("ROLE_USER",
                ((ArrayList<? extends GrantedAuthority>) actualMyUserDetails.getAuthorities()).get(0).getAuthority());
    }

    @Test
    public void testConstructor2() {
        UserModel userModel = mock(UserModel.class);
        when(userModel.getRoles()).thenReturn("foo");
        when(userModel.getActive()).thenReturn(true);
        when(userModel.getPassword()).thenReturn("foo");
        when(userModel.getUserName()).thenReturn("foo");
        MyUserDetails actualMyUserDetails = new MyUserDetails(userModel);
        assertTrue(actualMyUserDetails.isEnabled());
        assertEquals("foo", actualMyUserDetails.getPassword());
        assertEquals("foo", actualMyUserDetails.getUsername());
        assertEquals("foo",
                ((ArrayList<? extends GrantedAuthority>) actualMyUserDetails.getAuthorities()).get(0).getAuthority());
        verify(userModel).getPassword();
        verify(userModel).getActive();
        verify(userModel).getUserName();
        verify(userModel).getRoles();
    }

}
