package com.multicapas.multicapas.repository;


import com.multicapas.multicapas.model.Posteo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PosteoRepository implements IPosteoRepository {
    @Override
    public List<Posteo> traerTodos() {
        List<Posteo> listaPosteos = new ArrayList<Posteo>();
        listaPosteos.add(new Posteo(1L,"Formatear un Pc", "Luisina de paula"));
        listaPosteos.add(new Posteo(2L,"Formatear un Pc2", "Luisina de paula2"));
        return listaPosteos;
    }


    //métofdos para llamar a la base de datos, etc


}
