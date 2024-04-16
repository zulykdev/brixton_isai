package com.brixtom.democlases.ajedrez;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.security.PrivateKey;
@Getter
@Setter
@Slf4j
public class Ubicacion {
    private String codHori;
    private String codVert;

    public Ubicacion(String codHori, String codVert){
        setCodHori(codHori);
        setCodVert(codVert);
    }

}
