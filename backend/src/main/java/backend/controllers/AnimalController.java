package backend.controllers;

import backend.entities.Animals;
import backend.entities.Users;
import backend.repositories.AnimalsRepository;
import backend.repositories.SponsorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Code fortement inspiré de celui des controllers de l'ancien projet "Pawship"

@RestController
@RequestMapping("/animals")
@CrossOrigin()
public class AnimalController {

    @Autowired
    public AnimalsRepository animalsRepository;
    @Autowired
    public SponsorsRepository sponsorsRepository;

    @PostMapping("/insertAnimals")
    public Animals insertAnimals(@RequestBody Animals animal){
        animal.setIdAnimal(animal.getIdAnimal());
        animal.setNameAnimal(animal.getNameAnimal());
        animal.setAgeAnimal(animal.getAgeAnimal());
        animal.setDescAnimal(animal.getDescAnimal());
        animal.setImgAnimal(animal.getImgAnimal());
        animal.setVaccinatedAnimal(animal.isVaccinatedAnimal());
        animal.setPriceAnimal(animal.getPriceAnimal());

        return animalsRepository.save(animal);

    }

    @PutMapping("/updateAnimals")
    public Animals updateAnimal(@RequestBody Animals animals){
        Animals na = animalsRepository.findByIdAnimal(animals.getIdAnimal());
        na.setIdAnimal(animals.getIdAnimal());
        na.setNameAnimal(animals.getNameAnimal());
        na.setAgeAnimal(animals.getAgeAnimal());
        na.setDescAnimal(animals.getDescAnimal());
        na.setImgAnimal(animals.getImgAnimal());
        na.setVaccinatedAnimal(animals.isVaccinatedAnimal());
        na.setPriceAnimal(animals.getPriceAnimal());
        na.setSponsored(animals.isSponsored());
        return animalsRepository.save(na);

    }

    @GetMapping("/getAnimals")
    public List<Animals> showAnimals(){
        return animalsRepository.findAll();
    }

}
