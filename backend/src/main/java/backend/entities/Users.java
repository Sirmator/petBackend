package backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.context.annotation.Primary;

@Entity
@Data
public class Users {
    @Id
    private int idUser;
    @Column
    private String userName;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private String city;
    @Column
    private String postalCode;
    @Column
    private String roles;
}
