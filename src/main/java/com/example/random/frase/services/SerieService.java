package com.example.random.frase.services;

import com.example.random.frase.DTO.SerieDTO;
import com.example.random.frase.models.Serie;
import com.example.random.frase.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class SerieService {

    @Autowired
    private SerieRepository repoistorio;

    private Random random = new Random();

    public Optional<SerieDTO> buscarSerieAleatoria(){
        List<Serie> series = repoistorio.findAll().stream().toList();


        var numero = random.nextInt(series.size()) + 1;


        return repoistorio.findAll().stream()
                .filter(s -> s.getId() == (long) numero)
                .map(s-> new SerieDTO(s.getTitulo(),s.getFrase(),s.getPersonagem(),s.getPoster()))
                .findFirst();
    }
}
