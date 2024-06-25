package com.moises.curso.springboot.manager.error.exceptions.services;
import java.util.List;
import com.moises.curso.springboot.manager.error.exceptions.models.domain.User;

public interface UserService {

    List<User> findAll();
    User findById(Long id);
    
}
