package com.brixtom.democlases.reservas;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
public class Asiento {

    String codigo;
    Double precio;
    boolean isReserved;

    public Asiento(String codigo, Double precio, boolean Reserv){
        setCodigo(codigo);
        setPrecio(precio);
        isReserved = Reserv;
    }
    public void infoAsiento(){
        log.info("Codigo: " + getCodigo());
        log.info("Precio: " + getPrecio());
        log.info("¿Asiento disponible?: " + isReserved);
    }

}
