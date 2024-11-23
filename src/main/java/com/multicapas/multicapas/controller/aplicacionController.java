package com.multicapas.multicapas.controller;

import com.multicapas.multicapas.model.Basquet;
import com.multicapas.multicapas.model.Posteo;
import com.multicapas.multicapas.model.Triangulo;
import com.multicapas.multicapas.repository.IBasquetRepository;
import com.multicapas.multicapas.repository.IPosteoRepository;
import com.multicapas.multicapas.repository.IPromedioNotaRepository;
import com.multicapas.multicapas.repository.ITrianguloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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


    @Autowired
    IBasquetRepository basquetRepository;
    @PostMapping("/jugadores")
    public String crearListaBasquet(@RequestBody List<Basquet> basquets ) {
        List<Basquet> basquetsAux = new ArrayList<Basquet>();
        basquetsAux= basquets;

        return basquetRepository.crearListaJugadores(basquetsAux);
    }



    @Autowired
    ITrianguloRepository trianguloRepository;
    @GetMapping("/triangulo/{lado}/{altura}")
    public String crearTriangulo(@PathVariable double lado, @PathVariable double altura) {
        Triangulo triangulo = new Triangulo();
        triangulo.setBase(lado);
        triangulo.setAltura(altura);
        return trianguloRepository.calcularArea(triangulo);


    }
}
