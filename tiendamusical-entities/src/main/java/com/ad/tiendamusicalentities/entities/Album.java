package com.ad.tiendamusicalentities.entities;

import javax.persistence.*;

@Entity
@Table(name = "album")
public class Album extends Common {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAlbum")
    private Long idAlbum;
    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    @Column(name = "imagen", length = 100)
    private String imagen;
    @Column(name = "descripcion", length = 100)
    private String descripcion;
    @Column(name = "anio")
    private Long anio;
    @Column(name = "formato", length = 10)
    private String formato;
    @Column(name = "valor")
    private Double valor;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idDisquera")
    private Disquera disquera;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idArtista")
    private Artista artista;
    @Column(name = "raiting")
    private Integer raiting;

    public Long getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(Long idAlbum) {
        this.idAlbum = idAlbum;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getAnio() {
        return anio;
    }

    public void setAnio(Long anio) {
        this.anio = anio;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Disquera getDisquera() {
        return disquera;
    }

    public void setDisquera(Disquera disquera) {
        this.disquera = disquera;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista Artista) {
        this.artista = Artista;
    }

    public Integer getRaiting() {
        return raiting;
    }

    public void setRaiting(Integer raiting) {
        this.raiting = raiting;
    }
}
