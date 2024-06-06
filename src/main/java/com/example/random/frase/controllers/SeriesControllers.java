package com.example.random.frase.controllers;

import com.example.random.frase.DTO.SerieDTO;
import com.example.random.frase.models.Serie;
import com.example.random.frase.services.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SeriesControllers {
    @Autowired
     private SerieService servico;

    @GetMapping("/series/frases")
    public Optional<SerieDTO> buscarSeries(){
       return servico.buscarSerieAleatoria();
    }
}
