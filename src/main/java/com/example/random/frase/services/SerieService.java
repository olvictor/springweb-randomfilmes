package com.example.random.frase.services;

import com.example.random.frase.models.Serie;
import com.example.random.frase.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SerieService {

    @Autowired
    private SerieRepository repoistorio;

    private List<Serie> buscarSerie(){
        return repoistorio.findAll();
    }
}
