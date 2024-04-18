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

    @DeleteMapping("/delete/{id}")
    public int removeAnimal(@PathVariable int id){
        int removed = 0;
        animalsRepository.deleteByIdAnimal(id);
        sponsorsRepository.deleteByIdAnimal(id);
        if (animalsRepository.existsById(id)){
            removed = 1;
        }
        return removed;
    }

    @PostMapping("/insertAnimals")
    public Animals insertAnimal(@RequestBody Animals animals){
        animals.setNameAnimal(animals.getNameAnimal());
        animals.setAgeAnimal(animals.getAgeAnimal());
        animals.setDescAnimal(animals.getDescAnimal());
        animals.setImgAnimal(animals.getImgAnimal());
        animals.setVaccinatedAnimal(animals.isVaccinatedAnimal());
        animals.setPriceAnimal(animals.getPriceAnimal());
        animals.setSponsored(animals.isSponsored());

        return animalsRepository.save(animals);

    }

    @GetMapping("/getAnimals")
    public List<Animals> showAnimals(){
        return animalsRepository.findAll();
    }

}
