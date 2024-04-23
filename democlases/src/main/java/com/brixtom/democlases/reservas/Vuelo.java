package com.brixtom.democlases.reservas;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Vuelo {
    private String numeroVuelo;
    private LocalDateTime fechaSalida;
    private LocalDateTime fechaLlegada;
    private String origen; // LIMA
    private List<String> escalas; // 0 --- N
    private String destino; // ALEMANIA
    // private Aerolinea aerolineaVuelo;
    private List<Asiento> asientos; // los asientos tienen precios diferenciados. 
    // Los asientos ya estan definidos por cada Vuelo/Avion 
    private EstadoVuelo estado;
    private Avion avion;
    private LocalTime duracionVuelo;

    public Vuelo(String numVuelo, LocalDateTime fechaSalida,LocalDateTime fechaLlegada, String origen, List<String> escalas,String destino,
                 List<Asiento> asientos,EstadoVuelo estado, Avion avion,LocalTime duracionVuelo ){
        setNumeroVuelo(numVuelo);
        setFechaSalida(fechaSalida);
        setFechaLlegada(fechaLlegada);
        setOrigen(origen);
        setEscalas(new ArrayList<>());
        setDestino(destino);
        setAsientos(new ArrayList<>());
        setEstado(estado);
        setAvion(avion);
        setDuracionVuelo(duracionVuelo);
    }

    public Vuelo informacionVuelo(){
        return null;
    }

}
