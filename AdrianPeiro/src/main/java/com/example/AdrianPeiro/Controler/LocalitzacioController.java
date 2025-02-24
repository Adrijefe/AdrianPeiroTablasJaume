package com.example.AdrianPeiro.Controler;

import com.example.AdrianPeiro.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jugadors")

public class LocalitzacioController {
    @Autowired
    JugadoresRepository jugadoresRepository;

    @Autowired
    ListaJugadoresRepository listaJugadoresRepository;

    @Autowired
    TorneosRepository torneosRepository;

    @GetMapping("/jugadores")
    public List<Jugadores> getCiudades() {
        return jugadoresRepository.findAll();
    }


    @PostMapping("/jugadores")
    public void createCiudad(@RequestBody Jugadores jugadores) {
        jugadoresRepository.save(jugadores);
    }

    @DeleteMapping("/jugadores/{id}")
    public String deleteCiudad(@PathVariable Long id) {
        jugadoresRepository.deleteById(id);
        return "borrada";
    }

    @GetMapping("/lista")
    public List<ListaJugadores> getProvincias() {
        return listaJugadoresRepository.findAll();
    }


    @PostMapping("/lista")
    public void createProvincia(@RequestBody ListaJugadores listaJugadores) {
        listaJugadoresRepository.save(listaJugadores);
    }

    @DeleteMapping("/lista/{id}")
    public String deleteProvincias(@PathVariable Long id) {
        listaJugadoresRepository.deleteById(id);
        return "borrada";
    }

    @GetMapping("/torneos")
    public List<Torneos> getPaises() {
        return torneosRepository.findAll();
    }


    @PostMapping("/torneos")
    public void createPais(@RequestBody Torneos torneos) {
        torneosRepository.save(torneos);
    }

    @DeleteMapping("/torneos/{id}")
    public String deletePais(@PathVariable Long id) {
        torneosRepository.deleteById(id);
        return " borrada";
    }

}
