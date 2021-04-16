package deals.couponsmanager.Service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import deals.couponsmanager.Models.CouponsModel;

@Repository
public interface CouponsRepository extends MongoRepository<CouponsModel, String> {

}
