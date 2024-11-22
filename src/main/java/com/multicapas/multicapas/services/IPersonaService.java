package com.multicapas.multicapas.services;

import com.multicapas.multicapas.model.Persona;

import java.util.List;

public interface IPersonaService {
    public void createPersona(Persona per);
    public List<Persona> traerPersonas();
}
