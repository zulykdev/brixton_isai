package com.brixtom.democlases.reservas;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
@Setter
@Getter
@Slf4j
public class Avion {
    private Map<Integer, Asiento> asientosVip; //Aqui debo registrar Asientos FirstClass
    private Map<Integer, Asiento> asientosTurista; //Aqui debo registrar Asientos Turistas
    private Map<Integer, Asiento> asientosEconomico; //Aqui debo registrar Asientos Economicos
    private Integer capacidadPasajeros; //30
    private String marca;
    private String modelo;
    private String fabricante;

    public void mostrarInfoAsiento(int numeroAsiento) {
        numeroAsiento = 15;
        if (numeroAsiento <= capacidadPasajeros) {
            ///estoy buscando .... informacion
        } else {
            log.info("Este asiento no existe");//Ese asiento no existe
        }

    }
}
// Clase Avion
// 1 Avion puede estar/tener 1 ... o muchos ..... ? turbinas?
//
