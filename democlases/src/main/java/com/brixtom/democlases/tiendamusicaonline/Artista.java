package com.brixtom.democlases.tiendamusicaonline;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Slf4j
public class Artista {
    private String id;
    private String nombre;
    private List<Album> albumes;

    public Artista(String id, String nombre){
        setId(id);
        setNombre(nombre);
        setAlbumes(new ArrayList<>());
    }
    public void agregarAlbum(Album album) {
        albumes.add(album);
    }
}
