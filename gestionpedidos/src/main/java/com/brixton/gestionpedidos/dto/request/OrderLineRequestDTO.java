package com.brixton.gestionpedidos.dto.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class OrderLineRequestDTO {
    private int cantidad;
    private ProductRequestDTO producto;
    //private double precioUnitario;
    private double totalLine;
}
