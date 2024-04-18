package com.brixtom.democlases.agenciaviajes;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Getter
@Setter
@Slf4j
public class Reserva {
    private String id;
    private Cliente cliente;
    private PaqueteTuristico paquete;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precioFinal;

    public Reserva(String id, Cliente cliente, PaqueteTuristico paquete, LocalDate fechaInicio, LocalDate fechaFin, double precioFinal){
        setId(id);
        setCliente(cliente);
        setPaquete(paquete);
        setFechaInicio(fechaInicio);
        setFechaFin(fechaFin);
        setPrecioFinal(precioFinal);
    }

}
