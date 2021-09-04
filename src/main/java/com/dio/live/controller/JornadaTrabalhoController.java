package com.dio.live.controller;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.services.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
    @Autowired
    JornadaService jornadaService;


    @SuppressWarnings("unused")
    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){

        return  jornadaService.save(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornada(){
        return jornadaService.findAll();

    }
    @GetMapping ("/{idJornada")
    public JornadaTrabalho getJornadaByID(@PathVariable("idJornada")long idJornada) throws Exception {
        return (JornadaTrabalho) jornadaService.getById(idJornada).orElseThrow(() ->new Exception("jornada não encontrada."));
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){

        return  jornadaService.updateJornada(jornadaTrabalho);
    }


    @DeleteMapping ("/{idJornada")
    public JornadaTrabalho deleteByID(@PathVariable("idJornada")long idJornada) throws Exception {
        jornadaService.deleteJornada(idJornada);
        return (JornadaTrabalho) ResponseEntity.ok();
    }

}
