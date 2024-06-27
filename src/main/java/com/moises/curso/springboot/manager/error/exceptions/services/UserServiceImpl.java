package com.moises.curso.springboot.manager.error.exceptions.services;
import java.util.ArrayList;
import java.util.List;

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
    public User findById(Long id) {
        User user = null;
        for(User u : users) {
            if(u.getId().equals(id)){
                user = u;
                break;
            }
        }
        System.out.println(user.getLastname());
        return user;
    }

}
