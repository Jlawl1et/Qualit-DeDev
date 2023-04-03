package com.example.demo.web;

import com.example.demo.data.Voiture;
import com.example.demo.service.Echantillon;
import com.example.demo.service.Statistique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

public class StatistiqueController {

    @Autowired
    private Statistique statistique;

    @GetMapping(value = "/statistique")
    public Echantillon getStatistiques() {
        return statistique.prixMoyen();
    }

    @GetMapping(value = "/statistique/{id}")
    public @ResponseBody Voiture getVoitureById(@PathVariable("id") int id) {
        return statistique.findById(id);
    }


}