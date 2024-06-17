package com.brixton.gestionpedidos.dto.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ProductRequestDTO {
    private int id;
    private String name;
    private double price;
}
