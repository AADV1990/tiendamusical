package com.ad.tiendamusical.services.service;

import com.ad.tiendamusical.entities.dto.ArtistaAlbumDTO;
import com.ad.tiendamusicalentities.entities.Artista;

import java.util.List;

//inteface que define los metodos de la logica de negocio para la pantalla del home
public interface HomeService {
    List<ArtistaAlbumDTO> consultarAlbumsFiltro(String filtro);



}
