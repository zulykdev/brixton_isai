package com.brixton.gestionProduccion.dto.response;

import com.brixton.gestionProduccion.dto.request.CategoryRequestDTO;
import com.brixton.gestionProduccion.dto.request.InventoryRequestDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {
    private int id;
    private String name;
    private double price;
    private CategoryRequestDTO category;
    private InventoryRequestDTO inventory;
    private String createdAt;
    private String createdBy;
    private String updatedAt;
    private String updatedBy;
}
