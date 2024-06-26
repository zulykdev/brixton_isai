package com.brixton.gestionpedidos.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderLine {
    private int cantidad;
    private Product producto;
    private double precioUnitario;
    private double totalLine;

}
