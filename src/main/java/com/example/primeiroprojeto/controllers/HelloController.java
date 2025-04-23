package com.example.primeiroprojeto.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Define que esta classe é um controlador REST
@RestController
public class HelloController {

    // Define o endpoint HTTP GET em "/hello"
    @GetMapping("/hello")
    public String sayHello() {
        // Retorna a mensagem quando o endpoint é acessado
        return "Olá, bem-vindo ao Spring Boot!";
    }
}
