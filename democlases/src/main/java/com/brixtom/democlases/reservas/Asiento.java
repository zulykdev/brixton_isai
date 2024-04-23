package com.brixtom.democlases.reservas;

import ch.qos.logback.classic.Logger;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@ToString
public class Asiento {
    private PosicionAsiento posicion;
    private String codigo;
    private Double precio;
    private boolean isReserved;

    public Asiento(PosicionAsiento posicion, String codigo, Double precio, boolean reserv){
        setPosicion(posicion);
        setCodigo(codigo);
        setPrecio(precio);
        setReserved(reserv);

    }
}
