package com.brixton.gestionpedidos.service;

import com.brixton.gestionpedidos.dto.request.OrderRequestDTO;

public interface OrderService {
    /**
     * api/orders (POST): Realizar un nuevo pedido con generación de factura y detalles de envío.
      /api/orders/{id} (GET): Obtener detalles completos de un pedido, incluyendo factura y estado de envío.
      /api/orders/{id}/invoice (GET): Obtener la factura asociada a un pedido.
      /api/orders/{id}/shipping (GET): Obtener información de envío del pedido
     */
    Object saveOrder(OrderRequestDTO newOrder);
    Object getOrder(int orderId);
    Object getInvoice(int orderId);
    Object getStatusShipping(int orderId);
}
