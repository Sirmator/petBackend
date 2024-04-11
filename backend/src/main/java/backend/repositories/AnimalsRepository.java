package backend.repositories;

import backend.entities.Animals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalsRepository extends JpaRepository<Animals, Integer> {
    Animals findByIdAnimal (int idAnimal);
    Animals findByNameAnimal (String nameAnimal);

    Animals deleteByIdAnimal (int id);
}
