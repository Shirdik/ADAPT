package deals.dealsmanager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deals.dealsmanager.Models.DealsModel;
import deals.dealsmanager.dto.RequestModel;
import deals.dealsmanager.dto.RequestResponse;
import deals.dealsmanager.Service.DealsRepository;

@RestController()
@RequestMapping("/admin")
public class AdminDealsController {

    @Autowired
    DealsRepository dealsRepository;

    // Add Deal
    @PostMapping("/addDeal")
    public ResponseEntity<?> addDeal(@RequestBody RequestModel deal) {
        dealsRepository.save(new DealsModel(deal.getCode(), deal.getTitle(), deal.getDescription(), deal.getImageurl(),
                deal.getLink(), deal.getRewards(), deal.getCategory()));
        return ResponseEntity.ok(new RequestResponse("Added deal to the database:" + deal.getCode()));
    }

    // Edit Coupon
    @PutMapping("/editDeal")
    public ResponseEntity<?> editDeal(@RequestBody DealsModel updatedDeal) {
        DealsModel deal = dealsRepository.findById(updatedDeal.getDealCode()).orElseThrow();
        if (updatedDeal.getTitle() != "")
            deal.setTitle(updatedDeal.getTitle());
        if (updatedDeal.getDealCode() != "")
            deal.setDealCode(updatedDeal.getDealCode());
        if (updatedDeal.getDescription() != "")
            deal.setDescription(updatedDeal.getDescription());
        if (updatedDeal.getImageurl() != "")
            deal.setImageurl(updatedDeal.getImageurl());
        if (updatedDeal.getLink() != "")
            deal.setLink(updatedDeal.getLink());
        if (updatedDeal.getRewards() != 0)
            deal.setRewards(updatedDeal.getRewards());
        if (updatedDeal.getCategory() != "")
            deal.setCategory(updatedDeal.getCategory());
        dealsRepository.save(deal);
        return ResponseEntity.ok(new RequestResponse("Updated Deal" + deal.getTitle()));
    }

    // Delete Deal by id
    @DeleteMapping("/removeDeal/{dealCode}")
    public ResponseEntity<?> removeDeal(@PathVariable String dealCode) {
        dealsRepository.deleteById(dealCode);
        return ResponseEntity.ok(new RequestResponse("Removed deal from the database with id:" + dealCode));
    }
}
