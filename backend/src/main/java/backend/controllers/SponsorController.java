package backend.controllers;

import backend.entities.Sponsors;
import backend.repositories.SponsorsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "sponsors")
@CrossOrigin(origins = "hhtp/MettreLienBD")

public class SponsorController {

    SponsorsRepository sponsorsRepositor;
    public List<Sponsors> showSponsors(){
        return sponsorsRepositor.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public Integer removeSponsors(@PathVariable int id){
        int exists = 0;
        sponsorsRepositor.deleteByIdSponsors(id);
        if (sponsorsRepositor.existsById(id)) {
            exists = 1;
        }
        return exists;
    }

    @GetMapping("insert")
    public Sponsors insertSponsor(@RequestBody Sponsors sponsors){
        sponsors.setIdAnimal(sponsors.getIdAnimal());
        sponsors.setIdUser(sponsors.getIdUser());
        return sponsorsRepositor.save(sponsors);
    }

}
