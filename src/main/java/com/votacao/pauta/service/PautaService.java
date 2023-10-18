package com.votacao.pauta.service;

import com.votacao.pauta.models.Pauta;
import com.votacao.pauta.repository.PautaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PautaService {

    private PautaRepository pautaRepository;

    public PautaService(PautaRepository pautaRepository) {
        this.pautaRepository = pautaRepository;
    }

    public Pauta inserirPauta(Pauta pauta) {
        if (pauta.getDescricao().isEmpty()) {
            throw new RuntimeException("Não é possível criar uma pauta sem descrição");
        } else {
            return pautaRepository.save(pauta);
        }
    }

    public Pauta buscarPauta(Long id) {
        Optional<Pauta> pauta = pautaRepository.findById(id);
        if (pauta.isPresent()) {
            return pauta.get();
        } else {
            throw new RuntimeException("Pauta Inexistente");
        }
    }
}
