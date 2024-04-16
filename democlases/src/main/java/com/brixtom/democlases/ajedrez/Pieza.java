package com.brixtom.democlases.ajedrez;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Slf4j
public class Pieza {
    private String color;
    private String nombre;
    private Ubicacion ubicacion;
    public Pieza(String color, String nombre, Ubicacion ubicacion){
        setColor(color);
        setNombre(nombre);
        setUbicacion(ubicacion);
    }
    public void MostrarInfoPieza(){
        log.info("Color de Pieza: " + getColor());
        log.info("Nombre de Pieza: " + getNombre());
        log.info("Ubicación de Pieza: " + getUbicacion());
    }

}
