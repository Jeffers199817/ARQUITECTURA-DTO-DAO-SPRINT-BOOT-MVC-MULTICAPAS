package com.multicapas.multicapas.repository;

import com.multicapas.multicapas.model.PromedioNota;
import org.springframework.stereotype.Repository;

@Repository
public class PromedioNotaRepository implements IPromedioNotaRepository {


    @Override
    public double calcularPromedioNota(double nota1, double nota2, double nota3) {

        double promedioNota = (nota1 + nota2 + nota3) / 3;
        return promedioNota;
    }
}
