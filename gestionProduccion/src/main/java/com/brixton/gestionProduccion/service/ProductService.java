package com.brixton.gestionProduccion.service;

import com.brixton.gestionProduccion.dto.request.ProductRequestDTO;
import java.util.List;

public interface ProductService {
    /**api/products (POST): Agregar un nuevo producto con categorías y control de inventario.
      /api/products/{id} (GET): Obtener detalles de un producto (incluyendo categorías e
     inventario) por su ID.
      /api/products/{id} (PUT): Actualizar la información de un producto, categorías e inventario.
      /api/products/categories (GET): Obtener todas las categorías de productos.
      /api/products/{category}/inventory (GET): Obtener el inventario de productos de una
     categoría específica. */

    Object createProduct(ProductRequestDTO newProduct);
    Object getProduct(int idProduct);
    Object updateProduct(int idProduct, ProductRequestDTO updateProduct);

    List<String> getCategory();

    List<Object> getInventoryByCategory(String category);


}
