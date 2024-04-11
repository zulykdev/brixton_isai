package com.brixtom.democlases.clases;

import lombok.Getter;
import lombok.Setter;

@Setter //Son anotaciones
@Getter //son anotaciones
public class Direccion {
    private String nombre;
    private String calle;
    private String tipoCalle;
    private String urbanizacion;
    private String distrito;
    private String provincia;
    private String pais;
}
