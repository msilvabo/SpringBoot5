package com.moises.curso.springboot.manager.error.exceptions.services;
import java.util.List;
import java.util.Optional;

import com.moises.curso.springboot.manager.error.exceptions.models.domain.User;

public interface UserService {

    List<User> findAll();
    Optional<User> findById(Long id);
    
}
