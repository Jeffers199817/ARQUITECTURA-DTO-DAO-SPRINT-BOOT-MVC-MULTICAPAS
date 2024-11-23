package com.multicapas.multicapas.controller;

import com.multicapas.multicapas.model.Posteo;
import com.multicapas.multicapas.repository.IPosteoRepository;
import com.multicapas.multicapas.repository.IPromedioNotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class aplicacionController {

    @Autowired
    IPosteoRepository posteoRepository;

    @GetMapping("posteo")
    public List<Posteo> traerPosteos() {

        return posteoRepository.traerTodos();
    }

    @Autowired
    IPromedioNotaRepository promedioNotaRepository;

    @GetMapping("promedio")
    public String traerPromedioNotas(@RequestParam double nota1, @RequestParam double nota2,@RequestParam double nota3) {

        return  "Bienvenido a la caluladora de notas: " + "Valor 1: " + nota1 + " Valor 2: " + nota2 + " Valor 3: " + nota3 + " El Promedio es: " + promedioNotaRepository.calcularPromedioNota(nota1, nota2, nota3);
    }
}
