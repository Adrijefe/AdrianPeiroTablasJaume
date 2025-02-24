//package com.example.AdrianPeiro.Controler;
//
//import com.example.AdrianPeiro.Model.Jugadores;
//import com.example.AdrianPeiro.Model.JugadoresRepository;
//import com.example.AdrianPeiro.Model.ListaJugadores;
//import com.example.AdrianPeiro.Model.ListaJugadoresRepository;
//import com.example.AdrianPeiro.Model.Torneos;
//import com.example.AdrianPeiro.Model.TorneosRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//
//@Controller
//public class JugadoresController {
//
//    @Autowired
//    JugadoresRepository jugadoresRepository;
//
//    @Autowired
//    ListaJugadoresRepository listaJugadoresRepository;
//
//    @Autowired
//    TorneosRepository torneosRepository;
//
//    @GetMapping("/jugadores")
//    public String verJugadores(Model model) {
//        Iterable<Jugadores> jugadores = jugadoresRepository.findAll();
//        model.addAttribute("jugadores", jugadores);
//        return "jugadores";
//    }
//
//    @GetMapping("/listas")
//    public String verListas(Model model) {
//        Iterable<ListaJugadores> listaJugadores = listaJugadoresRepository.findAll();
//        model.addAttribute("listaJugadores", listaJugadores);
//        return "listaJugadores";
//    }
//
//    @GetMapping("/torneos")
//    public String verTorneos(Model model) {
//        Iterable<Torneos> torneos = torneosRepository.findAll();
//        model.addAttribute("torneo", torneos);
//        return "torneo";
//    }
//}
