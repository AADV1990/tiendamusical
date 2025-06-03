package com.ad.tiendamusical.services.service.impl;

import com.ad.tiendamusical.services.service.LoginService;
import com.ad.tiendamusicaldata.dao.PersonaDAO;
import com.ad.tiendamusicalentities.entities.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private PersonaDAO personaDAOImpl;

    //clase de que implementa las funciones para la logica de negocio para la pantalla de login
    @Override
    public Persona consultarUsuarioLogin(String usuario, String password) {
        System.out.println("Buscando usuario con: " + usuario + " / " + password);
        Persona persona = this.personaDAOImpl.findByUsuarioAndPassword(usuario, password);
        System.out.println("¿Encontrado?: " + (persona != null));


        return this.personaDAOImpl.findByUsuarioAndPassword(usuario, password);
    }


}
