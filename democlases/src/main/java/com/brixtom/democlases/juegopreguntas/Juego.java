package com.brixtom.democlases.juegopreguntas;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
@Slf4j
public class Juego {
    private List<Pregunta> preguntas;
    private List<Jugador> jugadores;
    private int puntosPorRespuestaCorrecta;

    public Juego(int puntosPorRespuestaBuena){
        setJugadores(new ArrayList<>());
        setPreguntas(new ArrayList<>());
        setPuntosPorRespuestaCorrecta(puntosPorRespuestaBuena);
    }
    public void agregarPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
    }
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        for (Pregunta pregunta : preguntas) {
            log.info(pregunta.getEnunciado());
            List<String> opciones = pregunta.getOpciones();
            for (int i = 0; i < opciones.size(); i++) {
                System.out.println((i + 1) + ": " + opciones.get(i));
            }
            log.info("Ingrese su respuesta: ");
            int respuesta = scanner.nextInt();
            for (Jugador jugador : jugadores) {
                if (pregunta.verificarRespuesta(respuesta - 1)) {
                    jugador.incrementarPuntaje(puntosPorRespuestaCorrecta);
                }
            }
        }
        scanner.close();
    }
    public void mostrarPuntajes() {
        for (Jugador jugador : jugadores) {
            log.info(jugador.getNombre() + ": " + jugador.getPuntaje() + " puntos");
        }
    }
}
