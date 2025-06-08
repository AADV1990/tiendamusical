package com.ad.tiendamusical.entities.dto;

import com.ad.tiendamusicalentities.entities.Album;
import com.ad.tiendamusicalentities.entities.Artista;

//clase DTO personalizada para el artista y el album
public class ArtistaAlbumDTO {

    private Artista artista;
    private Album album;
    public ArtistaAlbumDTO(Artista artista, Album album) {
        super();
    }
    public ArtistaAlbumDTO(Album a, Artista ar) {
        this.album = a;
        this.artista = ar;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
