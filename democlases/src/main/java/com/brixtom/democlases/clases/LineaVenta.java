package com.brixtom.democlases.clases;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LineaVenta {
    private Integer cantidad;
    private double precio;
    private String nombreProducto;
    private double total;
}
