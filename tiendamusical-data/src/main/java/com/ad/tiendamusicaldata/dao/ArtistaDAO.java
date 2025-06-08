package com.ad.tiendamusicaldata.dao;

import com.ad.tiendamusical.entities.dto.ArtistaAlbumDTO;
import com.ad.tiendamusicalentities.entities.Artista;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArtistaDAO extends PagingAndSortingRepository<Artista, Long> {
    @Query("SELECT new com.ad.tiendamusical.entities.dto.ArtistaAlbumDTO (a, ar) "
            + "FROM Album a "
            + "INNER JOIN a.artista ar "
            + "INNER JOIN ar.subGenero sg "
            + "INNER JOIN sg.genero g "
            + "where ar.nombre LIKE %:filtro% "
            + "or g.descripcion LIKE %:filtro% "
            + "or sg.descripcion LIKE %:filtro% "
            + "or a.nombre LIKE %:filtro% "
            + "ORDER BY ar.nombre")
    public List<ArtistaAlbumDTO> consultarArtistasAlbumsPorFiltro(@Param("filtro") String filtro);


}
