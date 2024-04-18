package com.brixtom.democlases.tiendamusicaonline;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Usuario {
    private String id;
    private String nombre;
    private String email;
    private String password; // Considerar encriptar esto en una implementación real

    public Usuario(String id, String nombre, String email, String password){
        setId(id);
        setNombre(nombre);
        setEmail(email);
        setPassword(password);
    }

}
