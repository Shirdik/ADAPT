package login.auth.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import login.auth.Models.UserModel;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    static UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserModel> user = userRepository.findById(username);

        user.orElseThrow(() -> new UsernameNotFoundException("User Not Found" + username));

        return user.map(MyUserDetails::new).get();
    }

}
