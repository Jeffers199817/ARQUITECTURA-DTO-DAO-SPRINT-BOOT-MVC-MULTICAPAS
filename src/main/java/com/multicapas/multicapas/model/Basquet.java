package com.multicapas.multicapas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Basquet {

    private long id;
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double estatura;

}
