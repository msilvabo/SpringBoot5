package com.moises.curso.springboot.manager.error.exceptions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {

    @GetMapping("/app")
    public String inicialString(){
        int value  = 100 / 0;
        return "ok 200";
    }
}
