package com.brixtom.democlases.gestioninventario;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Slf4j
public class Categoria {
    private String id;
    private String nombre;
    private List<Producto> productos;

    public Categoria(String id, String nombre){
      setId(id);
      setNombre(nombre);
      setProductos(new ArrayList<>());
    }
    public void agregarProducto(Producto productoAAgregar){
        setProductos(List<Producto> productoAAgregar);
    }
    public void quitarProducto(Producto productoAAquitar){

    }
    public void mostrarInfoCategoria(){
        log.info("El  Id de la categoria es: "+ getId());
        log.info("El  nombre de la categoria es: "+ getNombre());
        log.info("Los productos son: /n"+ getProductos());
    }
}
