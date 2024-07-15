package com.moises.curso.springboot.manager.error.exceptions.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moises.curso.springboot.manager.error.exceptions.exceptions.UserNotFoundException;
import com.moises.curso.springboot.manager.error.exceptions.models.domain.User;
import com.moises.curso.springboot.manager.error.exceptions.services.UserService;




@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService service;
    @GetMapping()
    public String inicialString(){
        // int value  = 100 / 0;
        int value = Integer.parseInt("1s0");
        return "ok 200";
    }

    @GetMapping("/show/{id}")
    public User findbyId(@PathVariable Long id) {
        User user = service.findById(id).orElseThrow(() -> new UserNotFoundException("Error el usuario no existe"));
        return user;
    }
    
    @GetMapping("/all")
    public List<User> all() {
        return service.findAll();
    }
    
}
