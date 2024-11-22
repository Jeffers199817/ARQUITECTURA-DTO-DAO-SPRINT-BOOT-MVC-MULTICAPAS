package com.multicapas.multicapas.services;

import com.multicapas.multicapas.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {
    //Métodos para lógica de nogocio
    @Override
    public void createPersona(Persona per) {

        System.out.println("Persona created");
        System.out.println("Creado exitosamente");

    }

    @Override
    public List<Persona> traerPersonas() {

        //acá deberia devolver la lista de personas
        return List.of();

    }


}
