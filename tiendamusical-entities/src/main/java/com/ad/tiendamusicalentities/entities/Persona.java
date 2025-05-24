package com.ad.tiendamusicalentities.entities;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona extends Common {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private int idPersona;
    @Column(name = "numeroIdentificacion", length = 45, nullable = false)
    private String numeroIdentificacion;
    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    @Column(name = "primerApellido", length = 100, nullable = false)
    private String primerApellido;
    @Column(name = "segundoApellido", length = 45, nullable = false)
    private String segundoApellido;
    @Column(name = "imagen", length = 100)
    private String imagen;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idTipoIdentificacion")
    private TipoDeIdentificacion idTipoIdentificacion;
    @Column(name = "usuario", length = 45, nullable = false)
    private String usuario;
    @Column(name = "password", length = 45, nullable = false)
    private String password;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idRol")
    private Rol idRol;


    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public TipoDeIdentificacion getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(TipoDeIdentificacion idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getIdRol() {
        return idRol;
    }

    public void setIdRol(Rol idRol) {
        this.idRol = idRol;
    }


}
