package com.brixtom.democlases.tiendamusicaonline;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Slf4j
public class Album {
    private String id;
    private String titulo;
    private Artista artista;
    private List<Cancion> canciones;

    public Album(String id, String titulo, Artista artista){
        setId(id);
        setTitulo(titulo);
        setArtista(artista);
        setCanciones(new ArrayList<>());
    }
    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }
}
