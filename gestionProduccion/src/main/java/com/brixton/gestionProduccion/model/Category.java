package com.brixton.gestionProduccion.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Category {
    private int id;
    private TypeCategory name;
    //private List<Product> productList;
}
