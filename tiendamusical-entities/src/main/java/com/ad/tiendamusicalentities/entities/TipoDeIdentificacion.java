package com.ad.tiendamusicalentities.entities;

import javax.persistence.*;

@Entity
@Table(name="tipoidentificacion")
public class TipoDeIdentificacion  extends Common{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idTipoIdentificacion")
    private int idTipoDeIdentificacion;
    @Column(name = "nombre",length = 45,nullable = false)
    private String nombre;


    public int getIdTipoDeIdentificacion() {
        return idTipoDeIdentificacion;
    }

    public void setIdTipoDeIdentificacion(int idTipoDeIdentificacion) {
        this.idTipoDeIdentificacion = idTipoDeIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
