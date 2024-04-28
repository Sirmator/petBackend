package backend.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Sponsors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSponsors;
    @Column
    private int idUser;
    @Column
    private int idAnimal;

}
