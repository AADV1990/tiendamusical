package com.ad.tiendamusicalentities.entities;

import javax.persistence.*;

@Entity
@Table(name = "artista")
public class Artista extends Common {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdArtista")
    private Long IdArtista;
    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    @Column(name = "imagen", length = 100)
    private String imagen;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idNacionalidad")
    private Nacionalidad nacionalidad;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idSubGenero")
    private SubGenero subGenero;

    public Long getIdArtista() {
        return IdArtista;
    }

    public void setIdArtista(Long idArtista) {
        IdArtista = idArtista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public SubGenero getSubGenero() {
        return subGenero;
    }

    public void setSubGenero(SubGenero subgenero) {
        subGenero = subgenero;
    }
}
