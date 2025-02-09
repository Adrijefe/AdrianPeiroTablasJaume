package com.example.AdrianPeiro.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Torneos")
public class Torneos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTorneo;  // Usando camelCase

    @Column(name = "NOMBRETORNEO", nullable = false)
    private String nombreTorneo;  // Usando camelCase

    @Column(name = "Año", nullable = false)
    private Integer año;

    @Column(name = "Resultado", nullable = false)
    private String resultado;

    @ManyToOne
    @JoinColumn(name = "ID_Jugador", nullable = false)
    private Jugadores jugador;

    // Constructor por defecto
    public Torneos() {}

    // Constructor con parámetros
    public Torneos(Integer idTorneo, String nombreTorneo, Integer año, String resultado, Jugadores jugador) {
        this.idTorneo = idTorneo;
        this.nombreTorneo = nombreTorneo;
        this.año = año;
        this.resultado = resultado;
        this.jugador = jugador;
    }

    // Métodos getter y setter
    public Integer getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(Integer idTorneo) {
        this.idTorneo = idTorneo;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
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
