package deals.rewardsmanager.Service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import deals.rewardsmanager.Models.RewardsModel;

@Repository
public interface RewardsRepository extends MongoRepository<RewardsModel, Integer> {

}
