package com.example.AdrianPeiro.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "Torneos")
public class Torneos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTorneo;

    @Column(name = "NOMBRETORNEO", nullable = false)
    private String nombreTorneo;

    @Column(name = "Año", nullable = false)
    private int año;

    @Column(name = "Resultado", nullable = false)
    private String resultado;


    @JsonIgnoreProperties("ID_Jugador")

    @ManyToOne
    @JoinColumn(name = "ID_Jugador", nullable = false)
    private Jugadores jugador;

    public Torneos() {
    }

    public Torneos(Long idTorneo, String nombreTorneo, int año, String resultado, Jugadores jugador) {
        this.idTorneo = idTorneo;
        this.nombreTorneo = nombreTorneo;
        this.año = año;
        this.resultado = resultado;
        this.jugador = jugador;
    }

    public Long getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(Long idTorneo) {
        this.idTorneo = idTorneo;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Jugadores getJugador() {
        return jugador;
    }

    public void setJugador(Jugadores jugador) {
        this.jugador = jugador;
    }
}