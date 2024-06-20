package com.brixton.sodimac.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Productos {
    private int id;
    private String name;
    private Categorias category;
    private int quantity;
    private int minQuantity;
    private double priceSuplier;
    private double priceSale;
    private String codeProduct;
}
