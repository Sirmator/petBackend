package backend.controllers;


import backend.entities.Animals;
import backend.entities.Users;
import backend.repositories.SponsorsRepository;
import backend.repositories.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("http://localhost:3000/")
public class UserController {

    @Autowired
    public UsersRepository usersRepository;

    @Autowired
    public SponsorsRepository sponsorsRepository;


    @PostMapping("/insertUsers")
    public Users insertUsers(@RequestBody Users user){
        user.setIdUser(user.getIdUser());
        user.setUserName(user.getUserName());
        user.setFirstName(user.getFirstName());
        user.setLastName(user.getLastName());
        user.setEmail(user.getEmail());
        user.setPhone(user.getPhone());
        user.setCity(user.getCity());
        user.setPostalCode(user.getPostalCode());
        user.setRoles(user.getRoles());

        return usersRepository.save(user);

    }

    @GetMapping("/getUsers")
    public List<Users> showUsers(){
        return usersRepository.findAll();
    }

}

