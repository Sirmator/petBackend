package backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Animals {
    @Id
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
