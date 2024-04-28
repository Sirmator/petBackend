package backend.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Animals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnimal;
    @Column
    private String nameAnimal;
    @Column
    private float ageAnimal;
    @Column
    private String descAnimal;
    @Column
    private String imgAnimal;
    @Column
    private boolean vaccinatedAnimal;
    @Column
    private float priceAnimal;
    @Column
    private boolean sponsored;
}
