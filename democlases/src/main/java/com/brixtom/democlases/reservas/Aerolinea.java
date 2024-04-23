package com.brixtom.democlases.reservas;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
public class Aerolinea {
    private String nombre;
    private String codigo;
    private List<String> destinos;
    private List<Avion> flota; 
    private List<PoliticaVuelo> politicaEquipajes;
    private List<PoliticaVuelo> politicaCancelacions;

    public void verificarDispoVuelo(Vuelo vueloDisponible){

    }
    public void reservarVuelo(Vuelo vueloAReservar){

    }
    public void cancelarVuelo(Vuelo vueloACancelar){

    }
    public void modificarVuelo (Vuelo vueloAModificar){

    }

}

// Clase Aerolinea 
// 1 Aerolinea puede estar/tener 1 ... o muchos ..... ? 
// 1 Aerolinea puede estar/tener 1 ... o muchos .... ? aviones?
