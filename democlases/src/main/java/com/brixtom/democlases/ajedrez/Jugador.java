package com.brixtom.democlases.ajedrez;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.core.Local;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Slf4j
public class Jugador {
    private String nombreJugador;
    private String colorEquipo;

    public Jugador(String nombreJugador, String colorEquipo) {
        setNombreJugador(nombreJugador);
        setColorEquipo(colorEquipo);
    }
    public void mostrarInfoJugadores(){
        log.info("Nombre de Jugador: " + getNombreJugador());
        log.info("Color de Piezas: " + getColorEquipo());
    }

}
