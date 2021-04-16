package deals.dealsmanager.Service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import deals.dealsmanager.Models.DealsModel;

@Repository
public interface DealsRepository extends MongoRepository<DealsModel, String> {

}
