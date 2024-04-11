package com.brixtom.democlases.clases;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Client {
    private String nombre;
    private String tipoIdentificacion;
    private String nroIdentificacion;
    private String categoria;
    private Integer edad;
    private Direccion direccion;


}
