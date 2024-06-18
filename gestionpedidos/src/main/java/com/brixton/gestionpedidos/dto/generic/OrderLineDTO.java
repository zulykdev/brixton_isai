package com.brixton.gestionpedidos.dto.generic;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class OrderLineDTO {
    private int cantidad;
    private ProductDTO producto;
    private double precioUnitario;
    private double totalLine;
}
