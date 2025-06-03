package com.ad.tiendamusical.services.service;

//interface que realiza  la logica de negocio para el inicio de session de la persona

import com.ad.tiendamusicalentities.entities.Persona;

public interface LoginService {
  //metodo que permite consultar un usuario que trata de ingresar al login
    Persona consultarUsuarioLogin   (String usuario, String password);

}

