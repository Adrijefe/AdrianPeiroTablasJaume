package com.example.AdrianPeiro.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table
public class Jugadores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nombre;
    private String pais;
    private int titulosGrandSlam;
    private String anosActividad;
    private String imagen;


    public Jugadores() {}

    public Jugadores(String nombre, String pais, int titulosGrandSlam, String anosActividad, String imagen) {
        this.nombre = nombre;
        this.pais = pais;
        this.titulosGrandSlam = titulosGrandSlam;
        this.anosActividad = anosActividad;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTitulosGrandSlam() {
        return titulosGrandSlam;
    }

    public void setTitulosGrandSlam(int titulosGrandSlam) {
        this.titulosGrandSlam = titulosGrandSlam;
    }

    public String getAnosActividad() {
        return anosActividad;
    }

    public void setAnosActividad(String anosActividad) {
        this.anosActividad = anosActividad;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}

