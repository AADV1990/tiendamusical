package com.ad.tiendamusicalweb.controllers;

import com.ad.tiendamusical.services.service.LoginService;
import com.ad.tiendamusicalentities.entities.Persona;
import com.ad.tiendamusicalweb.utils.CommonUtils;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

@ManagedBean(name = "loginController")
@ViewScoped
public class LoginController implements Serializable {

    private String usuario;
    private String password;
    //propiedad de la logica de negocio inyectada con JSF y Spring

    @ManagedProperty(value = "#{loginServiceImpl}")

    private LoginService loginServiceImpl;



    @PostConstruct
    public void init() {
        System.out.println("Iniciando LoginController");
    }

    public void entrar() {

        Persona personaConsultada = this.loginServiceImpl.consultarUsuarioLogin(this.usuario, this.password);
        if (personaConsultada != null) {
            CommonUtils.mostrarMensaje(FacesMessage.SEVERITY_INFO, "Bienvenido", "Bienvenido al sistema");
            System.out.println("¿LoginServiceImpl es nulo?: " + (loginServiceImpl == null));

        } else {
            CommonUtils.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "Ups", "El usuario y/o contraseña son incorrectos");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public LoginService getLoginServiceImpl() {
        return loginServiceImpl;
    }

    public void setLoginServiceImpl(LoginService loginServiceImpl) {
        this.loginServiceImpl = loginServiceImpl;
    }
}
