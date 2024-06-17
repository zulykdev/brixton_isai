package com.brixton.gestionProduccion.model;

public enum TypeCategory {
    FOOD("FOOD"),
    BEVERAGE("BEVERAGE"),
    NON_PERISHABLE("NON_PERISHABLE"),
    CLEANING_PRODUCT("CLEANING_PRODUCT");

    private String category;

    TypeCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return this.category;
    }
}
