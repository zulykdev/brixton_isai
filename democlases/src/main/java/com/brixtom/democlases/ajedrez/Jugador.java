package com.brixtom.democlases.ajedrez;

import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalTime;
import java.util.List;
@Getter
@Setter
public class Jugador {
    private String nombreJugador;
    private String bando;
    private LocalTime tiempoDeJugada;
    private List<Pieza> piezas;

}
