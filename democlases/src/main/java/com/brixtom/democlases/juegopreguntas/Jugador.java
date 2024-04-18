package com.brixtom.democlases.juegopreguntas;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Jugador {
    private String nombre;
    private int puntaje;

    public Jugador(String nombre){
        setNombre(nombre);
        setPuntaje(0);
    }
    public void incrementarPuntaje(int puntos){
        puntaje+=puntos;
    }

}
