package com.ad.tiendamusicalweb.controllers;

import com.ad.tiendamusical.entities.dto.ArtistaAlbumDTO;
import com.ad.tiendamusical.services.service.HomeService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.util.List;

//clase que controla el flujo de informacion para la pantalla home de cualquier tipo de usuario
@ManagedBean
public class HomeController {
    //texto ingresado por el cliente en el buscador
    private String filtro;
    //lista obtenidas a partir del filtro ingresado en el buscador
    private List<ArtistaAlbumDTO> artistasAlbumDTO;
    //Se inyecta el objeto de spring con jsf para obtener los metodos de la logica de negocio del home
    @ManagedProperty("#{homeServiceImpl}")
    private HomeService homeServiceImpl;

    //inicializando la pantalla
    @PostConstruct
    public void init() {
        System.out.println("Iniciando HomeController");
    }

    //metodo que permite los albumn de los artitas encontrados en la base de datos con respecto al filtro ingresado
    public void consultarArtistasAlbumsPorFiltro() {
        this.artistasAlbumDTO = this.homeServiceImpl.consultarAlbumsFiltro(this.filtro);
        if (this.artistasAlbumDTO != null) {
            this.artistasAlbumDTO.forEach(artistaAlbumDTO -> System.out.println("Atista: " + artistaAlbumDTO.getArtista().getNombre()));
        }
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public List<ArtistaAlbumDTO> getArtistasAlbumDTO() {
        return artistasAlbumDTO;
    }

    public void setArtistasAlbumDTO(List<ArtistaAlbumDTO> artistasAlbumDTO) {
        this.artistasAlbumDTO = artistasAlbumDTO;
    }

    public HomeService getHomeServiceImpl() {
        return homeServiceImpl;
    }

    public void setHomeServiceImpl(HomeService homeServiceImpl) {
        this.homeServiceImpl = homeServiceImpl;
    }
}
