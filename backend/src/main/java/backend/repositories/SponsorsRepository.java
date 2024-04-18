package backend.repositories;

import backend.entities.Sponsors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorsRepository extends JpaRepository<Sponsors, Integer> {
    Sponsors findByIdSponsors (int idSponsors);

    Sponsors deleteByIdSponsors(int id);
    Sponsors deleteByIdUser (int idUser);
    Sponsors deleteByIdAnimal (int idAnimal);


}
