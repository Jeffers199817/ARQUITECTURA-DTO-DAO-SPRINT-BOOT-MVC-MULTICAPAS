package com.multicapas.multicapas.repository;


import com.multicapas.multicapas.model.Basquet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
      public class BasquetRepository implements IBasquetRepository{


    @Override
    public String crearListaJugadores(List<Basquet> basquets) {

        double sumadDeNumeros = 0;
        double promedioDeNumeros = 0;

        List<Basquet> listaBasquets = new ArrayList<Basquet>();

        listaBasquets = basquets;

        for (Basquet basquet : listaBasquets) {

            sumadDeNumeros = sumadDeNumeros + basquet.getEstatura();
            System.out.println("Alturas : " + basquet.getEstatura());

        }

    promedioDeNumeros = sumadDeNumeros / listaBasquets.size();

        return "Jugadores registrados correctamente " + " EL PROMEDIO DE ALTURA ES: " + promedioDeNumeros  +  "Alturas ";
    }
}
