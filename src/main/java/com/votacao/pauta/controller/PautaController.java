package com.votacao.pauta.controller;

import com.votacao.pauta.models.Pauta;
import com.votacao.pauta.service.PautaService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/pauta")
@RestController
public class PautaController {
    private PautaService pautaService;

    public PautaController(PautaService pautaService) {
        this.pautaService = pautaService;
    }

    @GetMapping("{id}")
    public Pauta retonarPauta(@PathVariable Long id) {
        return pautaService.buscarPauta(id);

    }
    @PostMapping("/inserir-pauta")
    public Pauta inserirPauta (@RequestBody Pauta pauta) {
       return pautaService.inserirPauta(pauta);
    }
}
