package com.ad.tiendamusicalweb.utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.io.IOException;

public class CommonUtils {

    public static void mostrarMensaje(FacesMessage.Severity severity, String summary, String detail) {
        FacesMessage mensaje = new FacesMessage(severity, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }
// metodo que permite redireccionar entre pantallas del aplicativo
    public static void redireccionar(String url) throws IOException {
    ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
    String contextPath = externalContext.getRequestContextPath();
    externalContext.redirect(contextPath + url);
    }
}