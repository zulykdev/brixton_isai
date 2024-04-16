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
    private Origen origen; // LIMA
    private List<Escala> escalas; // 0 --- N
    private Destino destino; // ALEMANIA
    // private Aerolinea aerolineaVuelo;
    private List<Asiento> asientos; // los asientos tienen precios diferenciados. 
    // Los asientos ya estan definidos por cada Vuelo/Avion 
    // 
    
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
