package com.multicapas.multicapas.controller;

import com.multicapas.multicapas.model.Posteo;
import com.multicapas.multicapas.repository.IPosteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
