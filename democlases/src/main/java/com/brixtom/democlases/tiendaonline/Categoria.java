package com.brixtom.democlases.tiendaonline;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
public class Categoria {
    private String id;
    private String nombre;
    private List<Producto> productos;

    public Categoria(){

    }
}
