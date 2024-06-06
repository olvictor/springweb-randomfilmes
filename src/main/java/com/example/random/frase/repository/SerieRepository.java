package com.example.random.frase.repository;

import com.example.random.frase.models.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
        //@Query("SELECT s FROM Serie s order by function('RANDOM') LIMIT 1")
}
