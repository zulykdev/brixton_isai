package com.brixtom.democlases.tiendamusicaonline;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Cancion {
    private String id;
    private String titulo;
    private Artista artista;
    private Album album;
    private double duracion; // Duración en minutos

    public Cancion(String id, String titulo, Artista artista, Album album, double duracion){
        setId(id);
        setTitulo(titulo);
        setArtista(artista);
        setAlbum(album);
        setDuracion(duracion);
    }

}
