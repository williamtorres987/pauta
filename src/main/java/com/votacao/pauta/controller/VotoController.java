package com.votacao.pauta.controller;

import com.votacao.pauta.models.Pauta;
import com.votacao.pauta.models.Voto;
import com.votacao.pauta.service.PautaService;
import com.votacao.pauta.service.VotoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/voto")
public class VotoController {
    private VotoService votoService;
    public VotoController (VotoService votoService) { this.votoService = votoService;}

    @GetMapping("{id}")
    public Optional<Voto> retornarVoto(@PathVariable Long id) {
        return votoService.buscarVoto(id);
    }
    @PostMapping("/inserir-voto")
    public Voto inserirVoto (@RequestBody Voto voto) {
        return votoService.inserirVoto(voto);
    }
}

