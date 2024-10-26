package com.proyecto.backend.controller;

import com.proyecto.backend.service.IntegrantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IntegrantesController {

    @Autowired
    private IntegrantesService integrantesService;

    @GetMapping("/get-integrantes")
    public List<String> getIntegrantes() {
        return integrantesService.obtenerIntegrantes();
    }
}