package com.proyecto.backend.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Service
public class AutenticacionService {

    public boolean autenticar(String codigo, String password) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/integrantes.txt")))) {
            return br.lines().anyMatch(line -> {
                String[] parts = line.split(";");
                return parts[0].equals(codigo) && parts[1].equals(password);
            });
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
