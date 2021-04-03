package deals.dealsmanager.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deals.dealsmanager.Models.DealsModel;
import deals.dealsmanager.Service.DealsRepository;

@RestController()
@RequestMapping("/admin")
public class AdminDealsController {

    @Autowired
    DealsRepository dealsRepository;

    @PostMapping("/addDeal")
    public ResponseEntity<?> addDeal(@RequestBody DealsModel deal) {
        dealsRepository.save(deal);
        return ResponseEntity.ok("Added deal to the database:" + deal.getTitle());
    }

    @GetMapping("/allDeals")
    public List<DealsModel> allDeals() {
        return dealsRepository.findAll();
    }

    @GetMapping("/allDeals/{id}")
    public Optional<DealsModel> allDeal(@PathVariable int id) {
        return dealsRepository.findById(id);
    }

    @DeleteMapping("/removeDeal/{id}")
    public ResponseEntity<?> removeDeal(@PathVariable int id) {
        dealsRepository.deleteById(id);
        return ResponseEntity.ok("Removed deal from the database with id:" + id);
    }
}
