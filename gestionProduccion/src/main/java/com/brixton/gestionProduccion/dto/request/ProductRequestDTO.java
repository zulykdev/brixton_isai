package com.brixton.gestionProduccion.dto.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ProductRequestDTO {
    private int id;
    private String name;
    private double price;
    private CategoryRequestDTO category;
    private InventoryRequestDTO inventory;
}
