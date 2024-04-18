package com.brixtom.democlases.tiendaonline;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
@Slf4j
@Getter
@Setter
public class CarritoDeCompra {
    private String idCarrito;
    private Cliente miCliente;
    private Double total= 0.0;
    private Map<Producto, Integer> productos;
    public CarritoDeCompra(String idCarrito, Cliente miCliente, Double total, Map<Producto, Integer> productos){
        setIdCarrito(idCarrito);
        setMiCliente(miCliente);
        setTotal(total);
        setProductos(new HashMap<>());
    }

    public void agregarProducto(Producto productoComprado, int cantidad){

    }
    public void eliminarProducto(Producto productoAEliminar){

    }
    public String calcularTotal(){
        return null;
    }
    public void mostrarCarritoCompras() {
        log.info("ID de Carrito: " + getIdCarrito());
        log.info("Nombre de Cliente: " + getMiCliente());
        log.info("Productos: " + getProductos());
        log.info("Cantidad total: " + getTotal());
    }

}
