package com.ad.tiendamusicalentities.entities;

import javax.persistence.*;

@Entity
@Table(name = "disquera")
public class Disquera extends Common{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDisquera")
    private Long idDisquera;
    @Column(name = "descripcion", length = 100, nullable = false)
    private String descripcion;

    public Long getIdDisquera() {
        return idDisquera;
    }

    public void setIdDisquera(Long idDisquera) {
        this.idDisquera = idDisquera;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
