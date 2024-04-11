package com.brixtom.democlases.reservas;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Aerolinea {
    private String nombre;
    private String codigo;
    private List<String> destinos;
    private String politicaEquipaje;
    private String politicaCancelacion;

    public void verificarDispoVuelo(Vuelo vueloDisponible){

    }
    public void reservarVuelo(Vuelo vueloAReservar){

    }
    public void cancelarVuelo(Vuelo vueloACancelar){

    }
    public void modificarVuelo (Vuelo vueloAModificar){

    }

}
