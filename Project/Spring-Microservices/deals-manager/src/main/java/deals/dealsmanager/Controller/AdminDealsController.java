package deals.dealsmanager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deals.dealsmanager.Models.DealsModel;
import deals.dealsmanager.dto.RequestResponse;
import deals.dealsmanager.Service.DealsRepository;

@RestController()
@RequestMapping("/admin")
public class AdminDealsController {

    @Autowired
    DealsRepository dealsRepository;

    // Add Deal
    @PostMapping("/addDeal")
    public ResponseEntity<?> addDeal(@RequestBody DealsModel deal) {
        dealsRepository.save(deal);
        return ResponseEntity.ok(new RequestResponse("Added deal to the database:" + deal.getTitle()));
    }

    // Delete Deal by id
    @DeleteMapping("/removeDeal/{dealCode}")
    public ResponseEntity<?> removeDeal(@PathVariable String dealCode) {
        dealsRepository.deleteById(dealCode);
        return ResponseEntity.ok(new RequestResponse("Removed deal from the database with id:" + dealCode));
    }
}
