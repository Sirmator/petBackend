package backend.controllers;

import backend.entities.Sponsors;
import backend.repositories.AnimalsRepository;
import backend.repositories.SponsorsRepository;
import backend.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sponsors")
@CrossOrigin()

public class SponsorController {

    @Autowired
    SponsorsRepository sponsorsRepository;
    @Autowired
    UsersRepository usersRepository;
    @Autowired
    AnimalsRepository animalsRepository;
    public List<Sponsors> showSponsors(){
        return sponsorsRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public Integer removeSponsors(@PathVariable int id){
        int exists = 0;
        sponsorsRepository.deleteByIdSponsors(id);
        if (sponsorsRepository.existsById(id)) {
            exists = 1;
        }
        return exists;
    }


    @PostMapping("/insertSponsor")
    public Sponsors insertSponsors(@RequestBody Sponsors sponsor){
        sponsor.setIdSponsors(sponsor.getIdSponsors());
        sponsor.setIdUser(sponsor.getIdUser());
        sponsor.setIdAnimal(sponsor.getIdAnimal());

        return sponsorsRepository.save(sponsor);
    }

    @GetMapping("/getSponsors")
    public List<Sponsors> getAllSponsors(){
        return sponsorsRepository.findAll();
    }

}
