package com.brixtom.democlases.tiendaonline;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@ToString
@Getter
@Setter
public class CarritoDeCompra {
    private String idCarrito;
    private Cliente miCliente;
    private Double total= 0.0;
    //private Map<Producto, Integer> productos;
    private List<LineaDePedido> pedidos;
    public CarritoDeCompra(String idCarrito, Cliente miCliente, Double total, Map<Producto, Integer> productos){
        setIdCarrito(idCarrito);
        setMiCliente(miCliente);
        setTotal(total);
      //  setPedidos(new HashMap<>());
    }

    public void agregarProducto(Producto productoComprado, int cantidad){

    }
    public void eliminarProducto(Producto productoAEliminar){

    }
    public String calcularTotal(){
        return null;
    }

}
