package com.brixtom.democlases.tiendaonline;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Producto {
    private String idProducto;
    private String nombreProducto;
    private Double precio;
    private int stock;

    public Producto(String idProducto, String nombreProducto, Double precio, int cantidad){
        setIdProducto(idProducto);
        setNombreProducto(nombreProducto);
        setPrecio(precio);
        stock = cantidad;
    }
    public void mostrarInfo() {
        log.info("ID de producto: " + getIdProducto());
        log.info("Nombre de producto: " + getNombreProducto());
        log.info("Precio de producto: " + getPrecio());
        log.info("Cantidad de producto: " + getStock());
    }

}
