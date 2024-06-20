package com.brixton.sodimac.model.client;

public enum TypeDocument {
    CARNET_DE_EXTRANJERIA(0),
    DNI(1),
    PASSAPORTE(2);


    private Integer typeDocument;

    TypeDocument(Integer typeDocument) {
        this.typeDocument = typeDocument;
    }

    Integer getRol() {
        return this.typeDocument;
    }
}
