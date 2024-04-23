package com.brixtom.democlases.tiendaonline;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
public class SubCategoria {
    private String id;
    private String nombre;
    private Categoria categoria;

    public SubCategoria(){

    }
}
