package backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Sponsors {
    @Id
    private int idSponsors;
    @Column
    private int idUser;
    @Column
    private int idAnimal;

}
