package com.brixtom.democlases.agenciaviajes;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Destino {
    private String id;
    private String nombre;
    private String pais;
    private String descripcion;

    public Destino(String id, String nombre, String pais, String descripcion){
        setId(id);
        setNombre(nombre);
        setPais(pais);
        setDescripcion(descripcion);
    }

}
