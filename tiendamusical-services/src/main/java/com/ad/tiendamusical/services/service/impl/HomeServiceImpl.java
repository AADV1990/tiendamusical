package com.ad.tiendamusical.services.service.impl;

import com.ad.tiendamusical.entities.dto.ArtistaAlbumDTO;
import com.ad.tiendamusical.services.service.HomeService;
import com.ad.tiendamusicaldata.dao.ArtistaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private ArtistaDAO artistaDAOImpl;


    @Override
    public List<ArtistaAlbumDTO> consultarAlbumsFiltro(String filtro) {
        return this.artistaDAOImpl.consultarArtistasAlbumsPorFiltro(filtro);
    }


}
