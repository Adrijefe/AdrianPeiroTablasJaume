package com.example.AdrianPeiro.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "ListaJugadores")
public class ListaJugadores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Lista;

    private String NombreLista;
    @JsonIgnoreProperties("listaJugadores")

    @OneToMany(mappedBy = "listaJugadores", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Jugadores> jugadores;

    public ListaJugadores() {
    }

    public ListaJugadores(Long ID_Lista, String nombreLista, List<Jugadores> jugadores) {
        this.ID_Lista = ID_Lista;
        NombreLista = nombreLista;
        this.jugadores = jugadores;
    }

    public List<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }

    public String getNombreLista() {
        return NombreLista;
    }

    public void setNombreLista(String nombreLista) {
        NombreLista = nombreLista;
    }

    public Long getID_Lista() {
        return ID_Lista;
    }

    public void setID_Lista(Long ID_Lista) {
        this.ID_Lista = ID_Lista;
    }
}
