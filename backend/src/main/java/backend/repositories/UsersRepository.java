package backend.repositories;

import backend.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

    Users findByIdUser (int id_user);
    Users findByUserName (String user_name);
    Users findByEmail (String email);
    Users findByPostalCode (String postal_code);
    Users findByPhone (String phone);

    Users deleteByIdUser (int id_user);
    Users existsByIdUser (int id_user);
}
