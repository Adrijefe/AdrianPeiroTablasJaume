package com.example.AdrianPeiro.Controler;


import com.example.AdrianPeiro.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/jugadores")


public class VueController {

    @Autowired
    JugadoresRepository jugadoresRepository;

    @Autowired
    ListaJugadoresRepository listaJugadoresRepository;

    @Autowired
    TorneosRepository torneosRepository;




    @GetMapping("/jugador")
    public List<Jugadores> obtenerJugador(){
        return jugadoresRepository.findAll();

    }

    @GetMapping("/lista")
    public List<ListaJugadores> getListaJugadores() {
        return listaJugadoresRepository.findAll();
    }



    @GetMapping("/torneo")
    public List<Torneos> getTorneos() {
        return torneosRepository.findAll();
    }


}
