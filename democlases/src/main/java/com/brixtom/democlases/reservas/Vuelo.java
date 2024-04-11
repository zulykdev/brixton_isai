package com.brixtom.democlases.reservas;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
public class Vuelo {
    private String numeroVuelo;
    private LocalDateTime fechaSalida;
    private LocalDateTime fechaLlegada;
    private List<String> origen;
    private List<String> destino;
    private Aerolinea aerolineaVuelo;
    private Double precio;
    private Boolean disponibilidad;
    private List<String> tipoAvion;
    private LocalTime duracionVuelo;

    public void reservasAsiento(){

    }
    public void cancelarReserva(){

    }
    public void modificarReserva(){

    }
    public Vuelo informacionVuelo(){
        return null;
    }

}
