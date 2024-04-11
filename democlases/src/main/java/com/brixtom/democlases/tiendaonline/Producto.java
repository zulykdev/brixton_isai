package com.brixtom.democlases.tiendaonline;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Producto {
    private String idProducto;
    private String nombreProducto;
    private Double precio;
    private int stock;

}
