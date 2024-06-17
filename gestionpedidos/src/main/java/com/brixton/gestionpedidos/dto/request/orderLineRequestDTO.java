package com.brixton.gestionpedidos.dto.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class orderLineRequestDTO {
    private int cantidad;
    private ProductRequestDTO producto;
    //private double precioUnitario;
    private double totalLine;
}
