package com.brixtom.democlases.ajedrez;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Slf4j
public class Tablero {
    private Map<String,Jugador> gamer;
    private Map<String, Pieza> piezas;
    private List<Ubicacion> ubicaciones;

    public Tablero (Map<String,Jugador> gamer,Map<String,Pieza> piezas, List<Ubicacion> ubicaciones){
        setGamer(new HashMap<>());
        setPiezas(new HashMap<>());
        setUbicaciones(new ArrayList<>());
    }
    public void moverPieza(Jugador jugador, Pieza piezaAMover){
        //operacion demover pieza
    }
    public void iniciarJuego(){
        
    }


}

