package com.example.AdrianPeiro.Controler;

import com.example.AdrianPeiro.Model.JugadoresRepository;
import com.example.AdrianPeiro.Model.ListaJugadoresRepository;
import com.example.AdrianPeiro.Model.TorneosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class JugadoresController {

    @Autowired
    JugadoresRepository jugadoresRepository;

    @Autowired
    ListaJugadoresRepository listaJugadoresRepository;

    @Autowired
    TorneosRepository torneosRepository;


    @GetMapping("/jugadores")
    public String getJugadores(Model model) {
        model.addAttribute("Jugador", jugadoresRepository.findAll());
        return "jugadores";
    }

    @GetMapping("/listas")
    public String getListas(Model model) {
        model.addAttribute("ListaJugador", listaJugadoresRepository.findAll());
        return "listaJugadores";
    }


    @GetMapping("/torneos")
    public String getTorneos(Model model) {
        model.addAttribute("Torneo", torneosRepository.findAll());
        return "torneo";
    }







}

