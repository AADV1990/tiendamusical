package com.ad.tiendamusicalweb.utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class CommonUtils {

    public static void mostrarMensaje(FacesMessage.Severity severity, String summary, String detail) {
        FacesMessage mensaje = new FacesMessage(severity, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }
}
