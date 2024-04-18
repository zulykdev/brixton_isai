package com.brixtom.democlases.gestioninventario;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    private Categoria categoria;
    private Proveedor proveedor;

    public Producto(String codProducto, String nomProducto, double precio, int stock, Categoria categoria, Proveedor proveedor){
        setCodigo(codProducto);
        setNombre(nomProducto);
        setPrecio(precio);
        setStock(stock);
        setCategoria(categoria);
        setProveedor(proveedor);
    }

}
