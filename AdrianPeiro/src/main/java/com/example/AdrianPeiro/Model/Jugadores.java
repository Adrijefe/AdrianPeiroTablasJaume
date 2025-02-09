package com.example.AdrianPeiro.Model;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "Jugadores")
public class Jugadores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Jugador;

    private String Nombre;

    private String Pais;

    @Column(name = "Títulos_Grand_Slam", nullable = false)
    private Integer TitulosGrandSlam;

    @Column(name = "Años_Actividad", nullable = false)
    private String AñosActividad;

    @Column(name = "Imagen")
    private String Imagen;

    @ManyToOne
    @JoinColumn(name = "ID_Lista", nullable = false)
    private ListaJugadores listaJugadores;

    @OneToMany(mappedBy = "jugador", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Torneos> torneos;

    public Jugadores() {
    }

    public Jugadores(Long ID_Jugador, String nombre, String pais, Integer titulosGrandSlam, String añosActividad, String imagen, ListaJugadores listaJugadores, List<Torneos> torneos) {
        this.ID_Jugador = ID_Jugador;
        Nombre = nombre;
        Pais = pais;
        TitulosGrandSlam = titulosGrandSlam;
        AñosActividad = añosActividad;
        Imagen = imagen;
        this.listaJugadores = listaJugadores;
        this.torneos = torneos;
    }

    public Long getID_Jugador() {
        return ID_Jugador;
    }

    public void setID_Jugador(Long ID_Jugador) {
        this.ID_Jugador = ID_Jugador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public Integer getTitulosGrandSlam() {
        return TitulosGrandSlam;
    }

    public void setTitulosGrandSlam(Integer titulosGrandSlam) {
        TitulosGrandSlam = titulosGrandSlam;
    }

    public String getAñosActividad() {
        return AñosActividad;
    }

    public void setAñosActividad(String añosActividad) {
        AñosActividad = añosActividad;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
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

