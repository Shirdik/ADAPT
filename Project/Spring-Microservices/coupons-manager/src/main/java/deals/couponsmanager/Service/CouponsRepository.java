package deals.couponsmanager.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import deals.couponsmanager.Models.CouponsModel;

@Repository
public interface CouponsRepository extends MongoRepository<CouponsModel, Integer> {

    // Optional<List<Category>> findByCategory();

}
