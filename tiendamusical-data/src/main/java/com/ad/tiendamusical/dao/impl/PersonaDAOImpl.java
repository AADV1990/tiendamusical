package com.ad.tiendamusical.dao.impl;

import com.ad.tiendamusicaldata.common.CommonDAO;
import com.ad.tiendamusicaldata.dao.PersonaDAO;
import com.ad.tiendamusicalentities.entities.Persona;
// clase que implementa el crud generico y las funciones de la interface de PersonaDAO
public class PersonaDAOImpl extends CommonDAO<Persona,Integer, PersonaDAO> {
    public Persona findByUsuarioAndPassword(String usuario, String password) {
        return repository.findByUsuarioAndPassword(usuario, password);
    }
}
