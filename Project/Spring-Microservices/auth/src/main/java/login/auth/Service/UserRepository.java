package login.auth.Service;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import login.auth.Models.*;

@Repository
public interface UserRepository extends MongoRepository<UserModel, Integer> {

    Optional<UserModel> findByUserName(String username);

}
