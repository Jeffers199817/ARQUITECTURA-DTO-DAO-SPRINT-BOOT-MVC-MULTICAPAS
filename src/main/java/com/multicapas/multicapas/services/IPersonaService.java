package com.multicapas.multicapas.services;

import com.multicapas.multicapas.model.Posteo;

import java.util.List;

public interface IPersonaService {
    public void createPersona(Posteo per);
    public List<Posteo> traerPersonas();
}
