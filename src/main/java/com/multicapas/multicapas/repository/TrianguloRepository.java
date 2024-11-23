package com.multicapas.multicapas.repository;

import com.multicapas.multicapas.model.Triangulo;
import org.springframework.stereotype.Repository;

@Repository
public class TrianguloRepository implements ITrianguloRepository {

    @Override
    public String calcularArea(Triangulo triangulo) {

        double calculoArea = (triangulo.getAltura() * triangulo.getBase())/2;
        return "El área del triangulo es: "+  calculoArea;
    }
}
