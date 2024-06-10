package com.brixton.input.service;

import com.brixton.input.dto.request.StoreGenericRequestDTO;

import java.util.List;

public interface StoreService {
    Object saveOrder(StoreGenericRequestDTO orderForRegister);
    /**
     * Proceso de Hacer Orden:
     * 1. Almacena el valor de entrada en una coleccion, storeInputs
     * 2. Crea un objeto de tipo StoreResponseDTO, con el objetivo de colocar el valor de fecha de creacion
     *    Es decir, shipDate.
     * 3. Almacenar el objeto creado anteriormente (paso 2) en una coleccion, storeOutputs
     * 4. Devuelvo el objeto creado (paso 2)
     */
    List<Object> getInventory(String status);
    /**
     * Obtener la lista de orders por su estado
     * 1. Crear una lista con el tipo de dato StoreResponseDTO
     * 2. Recorrer los valores de ordenes realizadas
     * 3. Agregar la orden a la lista de acuerdo al estado buscado
     * 4. Mostrar la lista de acuerdo al estado.
     */
    Object getOrder(int idOrder);
    /**
     * Proceso de Obtener una orden de store por el ID
     * 1. Buscar el ID en el Map
     * 2. En caso exista: Devolver la informacion del Paso 1
     * 3. En caso no exista: Mensaje indicando que no se encontró
     */
    boolean deleteOrder(int idOrder);
    /**
     * Proceso de eliminar order en store
     * 1. Buscar el order con el Id ingresado
     * 2. En caso exista: debe eliminarse y devolver 204.
     * 3. En caso no exista: devolver 404
     */


}
