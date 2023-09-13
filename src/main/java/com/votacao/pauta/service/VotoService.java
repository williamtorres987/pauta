package com.votacao.pauta.service;
import com.votacao.pauta.models.Voto;
import com.votacao.pauta.repository.VotoRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class VotoService {

    private VotoRepository votoRepository;

    public VotoService(VotoRepository votoRepository) {
        this.votoRepository = votoRepository;
    }

    public Voto inserirVoto (Voto voto) {
        return votoRepository.save(voto);
    }
    public Optional<Voto> buscarVoto(Long id) {
        return votoRepository.findById(id);
    }


}
