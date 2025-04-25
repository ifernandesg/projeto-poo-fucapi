package com.example.primeiroprojeto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class TestController {

    @RequestMapping("/primeiro-projeto")
    
    public String Test() {
        return "Meu primeiro projeto spring, aluno Igor Fernandes Gonçalves";
    }
}
