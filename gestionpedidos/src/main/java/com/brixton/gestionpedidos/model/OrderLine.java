package com.brixton.gestionpedidos.model;

import com.brixton.gestionpedidos.dto.request.ProductRequestDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderLine {
    private int cantidad;
    private Product producto;
    //private double precioUnitario;
    private double totalLine;

}
