package com.brixtom.democlases.reservas;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Reserva {
    private Pasajero pasajeroAReservar;
    private Vuelo vueloAReserver;

    public Reserva(Pasajero pasajero,Vuelo vuelo){
        setPasajeroAReservar(pasajero);
        setVueloAReserver(vuelo);
    }

    public void reservarAsiento(){

    }
    public void cancelarReserva(){

    }
    public void modificarReserva(){

    }
    public void mostrarInfo() {
        log.info("Pasajero: " + getPasajeroAReservar());
        log.info("Detalles del Vuelo: /n" + getVueloAReserver());
    }
}
