package com.votacao.pauta.controller;

import com.votacao.pauta.models.Stave;
import com.votacao.pauta.service.StaveService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/stave")
@RestController
public class StaveController {
    private StaveService staveService;

    public StaveController(StaveService staveService) {
        this.staveService = staveService;
    }

    @GetMapping("{id}")
    public Stave getStave(@PathVariable Long id) {
        return staveService.searchStave(id);

    }
    @PostMapping("/insert-stave")
    public Stave insertStave(@RequestBody Stave stave) {

        return staveService.insertStave(stave);
    }
}
