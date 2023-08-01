package com.votacao.pauta.controller;

import com.votacao.pauta.models.Pauta;
import com.votacao.pauta.service.PautaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/pauta")
@RestController
public class PautaController {
    private PautaService pautaService;

    public PautaController(PautaService pautaService) {
        this.pautaService = pautaService;
    }

    @GetMapping("{id}")
    public Pauta retonarPauta(@PathVariable Long id) {
        return "retornando pauta";
    }
}
