package com.ad.tiendamusicaldata.dao;

import com.ad.tiendamusicalentities.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

//clase dao que realiza crud con spring jps para tabla persona
public interface PersonaDAO extends PagingAndSortingRepository<Persona, Integer> {
    //metodo que permite consultar el usuario y contraseña que trata de ingresar a session
    @Query(value = "SELECT * FROM persona WHERE usuario = ?1 AND password = ?2", nativeQuery = true)
    Persona findByUsuarioAndPassword(String usuario, String password);



}
