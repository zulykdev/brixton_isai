package com.brixtom.democlases.reservas;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Reserva {
    private Pasajero pasajero;
    private String usuario;
    private Vuelo vuelo;
    private Asiento asiento;
    private LocalDateTime fechaHora;

    public Reserva(Pasajero pasajero,Vuelo vuelo){
        setPasajero(pasajero);
        setVuelo(vuelo);
    }

    public void reservarAsiento(){

    }
    public void cancelarReserva(){

    }
    public void modificarReserva(){

    }

}
