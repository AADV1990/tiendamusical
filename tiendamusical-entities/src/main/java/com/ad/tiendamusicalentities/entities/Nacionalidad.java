package com.ad.tiendamusicalentities.entities;

import javax.persistence.*;

@Entity
@Table(name = "nacionalidad")
public class Nacionalidad extends Common{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNacionalidad")
    private Long idNacionalidad;
    @Column(name = "descripcion", length = 60, nullable = false)
    private String descripcion;
    @Column(name = "abreviacion", length = 4, nullable = false)
    private String abreviacion ;

    public Long getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Long idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAbrevacion() {
        return abreviacion;
    }

    public void setAbrevacion(String abrevacion) {
        this.abreviacion = abreviacion;
    }
}
