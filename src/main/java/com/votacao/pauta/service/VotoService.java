package com.votacao.pauta.service;

import com.votacao.pauta.models.Pauta;
import com.votacao.pauta.models.Voto;
import com.votacao.pauta.repository.PautaRepository;
import com.votacao.pauta.repository.VotoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VotoService {

    private VotoRepository votoRepository;
    private PautaRepository pautaRepository;

    public VotoService(VotoRepository votoRepository, PautaRepository pautaRepository) {
        this.votoRepository = votoRepository;
        this.pautaRepository = pautaRepository;
    }

    public Voto inserirVoto(Voto voto) {
        Optional<Pauta> pauta = pautaRepository.findById(voto.getIdPauta());
        if (pauta.isPresent()) {
            return votoRepository.save(voto);

        } else {
            throw new RuntimeException("Pauta Inexistente");
        }
    }

    public Voto buscarVoto(Long id) {
        Optional<Voto> voto = votoRepository.findById(id);
        if (voto.isPresent()) {
            return (voto.get());
        } else {
            throw new RuntimeException("Voto Inexistente");
        }
    }
}
