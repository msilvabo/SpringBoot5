package com.moises.curso.springboot.manager.error.exceptions;

import com.moises.curso.springboot.manager.error.exceptions.models.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    List<User> users() {
        List<User> users = new ArrayList<User>();
        users.add(new User(1L, "Pepe", "Gonzales"));
        users.add(new User(2L, "Andres", "Mena"));
        users.add(new User(3L, "Maria", "Perez"));
        users.add(new User(4L, "Jose", "Ramirez"));
        users.add(new User(5L, "Alejandra", "Gutierrez"));
        return users;
    }
}
