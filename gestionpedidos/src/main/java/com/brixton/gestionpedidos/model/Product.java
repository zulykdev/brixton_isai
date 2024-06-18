package com.brixton.gestionpedidos.model;

import jdk.jfr.Threshold;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {
    private int id;
    private String name;
    private String category;

}
