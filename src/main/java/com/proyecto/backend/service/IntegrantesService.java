package com.proyecto.backend.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IntegrantesService {

    public List<String> obtenerIntegrantes() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/integrantes.txt")))) {
            return br.lines()
                    .map(line -> line.split(";")[2] + " " + line.split(";")[3])
                    .collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }
}