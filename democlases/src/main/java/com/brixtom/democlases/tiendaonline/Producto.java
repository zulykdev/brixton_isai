package com.brixtom.democlases.tiendaonline;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Getter
@Setter
@ToString
public class Producto {
    private String idProducto;
    private String nombreProducto;
    private String descripcion;
    private Double precio;
    private int stock;
    private String marca;
    private List<String> colors;
    private Categoria categoria;
    private SubCategoria subcategory;

    public Producto(String idProducto, String nombreProducto, Double precio, int cantidad){
        setIdProducto(idProducto);
        setNombreProducto(nombreProducto);
        setPrecio(precio);
        stock = cantidad;
    }

}
