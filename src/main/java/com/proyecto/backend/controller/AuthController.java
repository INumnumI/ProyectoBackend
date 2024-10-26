package com.proyecto.backend.controller;

import com.proyecto.backend.service.AutenticacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AutenticacionService autenticacionService;

    @PostMapping("/autenticar")
    public boolean autenticar(@RequestParam String codigo, @RequestParam String password) {
        return autenticacionService.autenticar(codigo, password);
    }
}
