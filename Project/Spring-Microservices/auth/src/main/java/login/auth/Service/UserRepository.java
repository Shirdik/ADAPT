package login.auth.Service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.security.core.userdetails.User;

import login.auth.Models.*;

public interface UserRepository extends MongoRepository<UserModel, Integer> {

    User findByUsername(String username);

}
