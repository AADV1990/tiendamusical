package com.ad.tiendamusicalweb.controllers;

import com.ad.tiendamusicalweb.utils.CommonUtils;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

@ManagedBean(name = "loginController")
@ViewScoped
public class LoginController implements Serializable {

    private String usuario;
    private String password;

    @PostConstruct
    public void init() {
        System.out.println("Iniciando LoginController");
    }

    public void entrar() {
        if ("admin".equals(usuario) && "admin123".equals(password)) {
            CommonUtils.mostrarMensaje(FacesMessage.SEVERITY_INFO, "Bienvenido", "Bienvenido al sistema");
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
}
