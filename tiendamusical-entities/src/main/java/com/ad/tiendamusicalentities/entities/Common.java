package com.ad.tiendamusicalentities.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.LocalDateTime;

//contiene los campos de la base de datos que se pueden utilizar en varias tablas
@MappedSuperclass
public class Common {
    @Column(name = "fechaCreacion", nullable = false)
    private LocalDateTime fechaCreacion;
    @Column(name = "fechaModificacion")
    private LocalDateTime fechaModificacion;
    @Column(name = "estatus")
    private Boolean estatus;

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }
}
