package com.brixtom.democlases.tiendaonline;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LineaDePedido {
    private String id;
    private Producto producto;
    private Integer cantidad;
    private Double precio;
    private Double dscto;
    private Double subTotal;
}
