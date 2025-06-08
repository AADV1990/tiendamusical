package com.ad.tiendamusical.dao.impl;

import com.ad.tiendamusical.entities.dto.ArtistaAlbumDTO;
import com.ad.tiendamusicaldata.common.CommonDAO;
import com.ad.tiendamusicaldata.dao.ArtistaDAO;
import com.ad.tiendamusicalentities.entities.Artista;

import java.util.List;

public class ArtistaDAOImpl extends CommonDAO<Artista, Long ,ArtistaDAO> {
        public List<ArtistaAlbumDTO> consultarArtistasAlbumsPorFiltro(String filtro) {
        return repository.consultarArtistasAlbumsPorFiltro(filtro);
        }

}
