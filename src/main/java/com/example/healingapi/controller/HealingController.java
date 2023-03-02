package com.example.healingapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("healing")
public class HealingController {

    @PostMapping("/runtest")
    public String runTest() {
        return "Vamos rodar os testes";
    }
}
