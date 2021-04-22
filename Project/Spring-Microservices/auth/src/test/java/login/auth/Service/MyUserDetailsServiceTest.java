package login.auth.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;

import login.auth.Models.UserModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {MyUserDetailsService.class})
@ExtendWith(SpringExtension.class)
public class MyUserDetailsServiceTest {
    @Autowired
    private MyUserDetailsService myUserDetailsService;

    @MockBean
    private UserRepository userRepository;

    @Test
    public void testLoadUserByUsername() throws UsernameNotFoundException {
        UserModel userModel = new UserModel();
        userModel.setLastName("Doe");
        userModel.setActive(true);
        userModel.setPassword("iloveyou");
        userModel.setEmail("jane.doe@example.org");
        userModel.setUserName("janedoe");
        userModel.setDealCodes(new HashSet<String>());
        userModel.setRoles("Roles");
        userModel.setFirstName("Jane");
        userModel.setCouponCodes(new HashSet<String>());
        Optional<UserModel> ofResult = Optional.<UserModel>of(userModel);
        when(this.userRepository.findById(anyString())).thenReturn(ofResult);
        UserDetails actualLoadUserByUsernameResult = this.myUserDetailsService.loadUserByUsername("janedoe");
        assertTrue(actualLoadUserByUsernameResult.isEnabled());
        assertEquals("iloveyou", actualLoadUserByUsernameResult.getPassword());
        assertEquals("janedoe", actualLoadUserByUsernameResult.getUsername());
        assertEquals("Roles",
                ((ArrayList<? extends GrantedAuthority>) actualLoadUserByUsernameResult.getAuthorities()).get(0)
                        .getAuthority());
        verify(this.userRepository).findById(anyString());
    }

    @Test
    public void testLoadUserByUsername2() throws UsernameNotFoundException {
        UserModel userModel = new UserModel();
        userModel.setLastName("Doe");
        userModel.setActive(true);
        userModel.setPassword("iloveyou");
        userModel.setEmail("jane.doe@example.org");
        userModel.setUserName("janedoe");
        userModel.setDealCodes(new HashSet<String>());
        userModel.setRoles("");
        userModel.setFirstName("Jane");
        userModel.setCouponCodes(new HashSet<String>());
        Optional<UserModel> ofResult = Optional.<UserModel>of(userModel);
        when(this.userRepository.findById(anyString())).thenReturn(ofResult);
        this.myUserDetailsService.loadUserByUsername("janedoe");
        verify(this.userRepository).findById(anyString());
    }

    @Test
    public void testLoadUserByUsername3() throws UsernameNotFoundException {
        when(this.userRepository.findById(anyString())).thenReturn(Optional.<UserModel>empty());
        assertThrows(UsernameNotFoundException.class, () -> this.myUserDetailsService.loadUserByUsername("janedoe"));
        verify(this.userRepository).findById(anyString());
    }
}

