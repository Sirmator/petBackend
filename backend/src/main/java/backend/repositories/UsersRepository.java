package backend.repositories;

import backend.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

    Users findByIdUser (int idUser);
    Users findByUserName (String userName);
    Users findByEmail (String email);
    Users findByPostalCode (String postalCode);
    Users findByPhone (String phone);

    Users deleteByIdUser (int idUser);
    Users existsByIdUser (int idser);
}
