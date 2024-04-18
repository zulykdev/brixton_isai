package com.brixtom.democlases.agenciaviajes;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Slf4j
public class PaqueteTuristico {
    private String id;
    private List<Destino> destinos;
    private double precio;
    private String descripcion;

    public PaqueteTuristico(String id, List<Destino> destinos, double precio, String descripcion){
        setId(id);
        setDestinos(new ArrayList<>());
        setPrecio(precio);
        setDescripcion(descripcion);
    }

}
