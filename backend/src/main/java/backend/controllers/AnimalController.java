package backend.controllers;

import backend.entities.Animals;
import backend.repositories.AnimalsRepository;
import backend.repositories.SponsorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Code fortement inspiré de celui des controllers de l'ancien projet "Pawship"

@RestController
@RequestMapping("/animals")
@CrossOrigin("http://localhost:3000/")
public class AnimalController {

    @Autowired
    public AnimalsRepository animalsRepository;
    @Autowired
    public SponsorsRepository sponsorsRepository;



    @PostMapping("/updateAnimals")
    public Animals insertAnimal(@RequestBody Animals animals){
        Animals na = animalsRepository.findByIdAnimal(animals.getIdAnimal());
        na.setNameAnimal(animals.getNameAnimal());
        na.setAgeAnimal(animals.getAgeAnimal());
        na.setDescAnimal(animals.getDescAnimal());
        na.setImgAnimal(animals.getImgAnimal());
        na.setVaccinatedAnimal(animals.isVaccinatedAnimal());
        na.setPriceAnimal(animals.getPriceAnimal());
        na.setSponsored(animals.isSponsored());

        return animalsRepository.save(animals);

    }

    @GetMapping("/getAnimals")
    public List<Animals> showAnimals(){
        return animalsRepository.findAll();
    }

}
