package com.brixtom.democlases.tiendamusicaonline;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Slf4j
public class TiendaOnline {
    private List<Usuario> usuarios;
    private List<Artista> artistas;
    private List<Album> albumes;
    private List<Cancion> canciones;

    public TiendaOnline(){
        setUsuarios(new ArrayList<>());
        setArtistas(new ArrayList<>());
        setAlbumes(new ArrayList<>());
        setCanciones(new ArrayList<>());
    }
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public void agregarArtista(Artista artista) {
        artistas.add(artista);
    }
    public void agregarAlbum(Album album) {
        albumes.add(album);
        artistas.get(artistas.indexOf(album.getArtista())).agregarAlbum(album);
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
        albumes.get(albumes.indexOf(cancion.getAlbum())).agregarCancion(cancion);
    }

}
