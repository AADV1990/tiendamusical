package com.ad.tiendamusicaldata.dao;

import com.ad.tiendamusicalentities.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

//clase dao que realiza crud con spring jps para tabla persona
public interface PersonaDAO extends PagingAndSortingRepository<Persona, Long> {
    //metodo que permite consultar el usuario y contraseña que trata de ingresar a session
    @Query("SELECT p FROM Persona p WHERE p.usuario =?1 AND p.password = ?2")
    Persona findByUsuarioAndPassword( String usuario, String password);

}
