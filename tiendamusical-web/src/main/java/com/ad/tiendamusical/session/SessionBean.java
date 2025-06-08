package com.ad.tiendamusical.session;

import com.ad.tiendamusicalentities.entities.Persona;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

//clase que permite crear la sesion del usuario
@ManagedBean
@SessionScoped
public class SessionBean {
    private Persona persona;

    @PostConstruct
    public void init() {
        System.out.println("Iniciando Session...");
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
