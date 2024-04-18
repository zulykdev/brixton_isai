package com.brixtom.democlases.gestioninventario;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Slf4j
public class Proveedor {
    private String idProveedor;
    private String nombreProveedor;
    private String direccion;
    private List<Producto> productosSuministrados;

    public Proveedor(String id, String nombre, String direccion){
        setIdProveedor(id);
        setNombreProveedor(nombre);
        setDireccion(direccion);
        setProductosSuministrados(new ArrayList<>());
    }

}
