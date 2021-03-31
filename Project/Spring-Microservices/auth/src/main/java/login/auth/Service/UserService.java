package login.auth.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User foundUser = userRepository.findByUsername(username);
        if (foundUser == null)
            return null;
        String name = foundUser.getUsername();
        String pwd = foundUser.getPassword();
        return new User(name, pwd, null);

    }

}
