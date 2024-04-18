package com.brixtom.democlases.gestioninventario;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Slf4j
public class GestorInventario {
    private List<Producto> productos;
    private List<Categoria> categorias;
    private List<Proveedor> proveedores;
    public GestorInventario(){
        setProductos(new ArrayList<>());
        setCategorias(new ArrayList<>());
        setProveedores(new ArrayList<>());
    }
    //TRABAJAMOS CON LOS PRODUCTOS
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public void eliminarProducto(String codigo) {
        productos.removeIf(producto -> producto.getCodigo().equals(codigo));
    }
    public Producto buscarProducto(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            } else {
                log.info("No existe producto");
            }
        }
        return null;  // Retorna null si no encuentra el producto.
    }
    public void actualizarStockProducto(String codigo, int nuevoStock) {
        Producto producto = buscarProducto(codigo);
        if (producto != null) {
            producto.setStock(nuevoStock);
        }
    }
    //TRABAJAMOS CON LAS CATEGORIAS
    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void eliminarCategoria(String id) {
        //categorias.removeIf(categoria -> categoria.getId().equals(id));
    }

    public Categoria buscarCategoria(String id) {
        for (Categoria categoria : categorias) {
            if (categoria.getId().equals(id)) {
                return categoria;
            }
        }
        return null;  // Retorna null si no encuentra la categoría.
    }
    //TRABAJAMOS CON LOS PROVEEDORES
    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public void eliminarProveedor(String id) {
        //proveedores.removeIf(proveedor -> proveedor.getIdProveedor().equals(id));
    }

    public Proveedor buscarProveedor(String id) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getIdProveedor().equals(id)) {
                return proveedor;
            }
        }
        return null;  // Retorna null si no encuentra el proveedor.
    }
}
