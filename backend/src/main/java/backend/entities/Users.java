package backend.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.Primary;

@Entity
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
