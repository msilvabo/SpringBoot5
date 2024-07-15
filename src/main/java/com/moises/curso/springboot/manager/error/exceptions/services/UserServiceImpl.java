package com.moises.curso.springboot.manager.error.exceptions.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.moises.curso.springboot.manager.error.exceptions.exceptions.UserNotFoundException;
import org.springframework.stereotype.Service;
import com.moises.curso.springboot.manager.error.exceptions.models.domain.User;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    
    public UserServiceImpl() {
        this.users = new ArrayList<User>();
        users.add(new User(1L, "Pepe", "Gonzales"));
        users.add(new User(2L, "Andres", "Mena"));
        users.add(new User(3L, "Maria", "Perez"));
        users.add(new User(4L, "Jose", "Ramirez"));
        users.add(new User(5L, "Alejandra", "Gutierrez"));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        User user = null;
        for(User u : users) {
            if(u.getId().equals(id)){
                user = u;
                break;
            }
        }
//        if (user == null){
//            throw new UserNotFoundException("Usuario not found");
//        }

        return Optional.ofNullable(user);
    }

}
