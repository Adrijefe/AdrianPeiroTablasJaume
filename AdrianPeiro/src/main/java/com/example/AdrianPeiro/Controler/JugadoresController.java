package com.example.AdrianPeiro.Controler;

import com.example.AdrianPeiro.Model.Jugadores;
import com.example.AdrianPeiro.Model.JugadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jugadores")
public class JugadoresController {

    @Autowired
        JugadoresRepository jugadoresRepository;

    @GetMapping
    public List<Jugadores> obtenerJugador(){
        return (List<Jugadores>) jugadoresRepository.findAll();

    }

    @GetMapping("/id")
    public ResponseEntity<Jugadores> obtenerJugadorPorId(@PathVariable(value = "id")Long id){
        Optional<Jugadores> jugadores = jugadoresRepository.findById(id);

        if (jugadores.isPresent()){
            return ResponseEntity.ok().body(jugadores.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Jugadores crearJugador(@RequestBody Jugadores jugadores){
        return jugadoresRepository.save(jugadores);
    }

    @DeleteMapping("/{id}")
    public void eliminarJugadores(@PathVariable Long id){jugadoresRepository.deleteById(id);}

    @PutMapping("/{id}")
    public ResponseEntity<Jugadores>actualizarJugadores(@PathVariable Long id, @RequestBody Jugadores jugadoresActualizados) {
        Optional<Jugadores> optionalJugadores = jugadoresRepository.findById(id);

        if (optionalJugadores.isPresent()) {
            Jugadores jugadores = optionalJugadores.get();
            jugadores.setNombre(jugadoresActualizados.getNombre());
            jugadores.setAnosActividad(jugadoresActualizados.getAnosActividad());
            jugadores.setPais(jugadoresActualizados.getPais());
            jugadores.setTitulosGrandSlam(jugadoresActualizados.getTitulosGrandSlam());
            jugadores.setImagen(jugadoresActualizados.getImagen());

            return ResponseEntity.ok().body(jugadoresRepository.save(jugadores));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

