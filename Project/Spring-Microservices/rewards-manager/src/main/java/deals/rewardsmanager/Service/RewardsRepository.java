package deals.rewardsmanager.Service;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import deals.rewardsmanager.Models.RewardsModel;

public interface RewardsRepository extends MongoRepository<RewardsModel, String> {

    Optional<RewardsModel> findByUsername(String username);
}
