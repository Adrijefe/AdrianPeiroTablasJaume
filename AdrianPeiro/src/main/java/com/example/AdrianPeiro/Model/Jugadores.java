package com.example.AdrianPeiro.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Jugadores")
public class Jugadores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    private String pais;

    @Column(name = "titulos_grand_slam")
    private int titulosGrandSlam;

    @Column(name = "anos_actividad")
    private String anosActividad;

    private String imagen;

    @JsonIgnoreProperties("jugadores")
    @ManyToOne
    @JoinColumn(name = "id_lista", nullable = false)
    private ListaJugadores listaJugadores;

    @JsonIgnoreProperties("jugador")
    @OneToMany(mappedBy = "jugador", cascade = CascadeType.ALL, orphanRemoval = true)

    private List<Torneos> torneos;

    // Constructores
    public Jugadores() {
    }

    public Jugadores(Long id, String nombre, String pais, int titulosGrandSlam, String anosActividad, String imagen, ListaJugadores listaJugadores, List<Torneos> torneos) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.titulosGrandSlam = titulosGrandSlam;
        this.anosActividad = anosActividad;
        this.imagen = imagen;
        this.listaJugadores = listaJugadores;
        this.torneos = torneos;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public ListaJugadores getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ListaJugadores listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public List<Torneos> getTorneos() {
        return torneos;
    }

    public void setTorneos(List<Torneos> torneos) {
        this.torneos = torneos;
    }
}
