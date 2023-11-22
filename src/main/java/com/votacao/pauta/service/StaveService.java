package com.votacao.pauta.service;

import com.votacao.pauta.exception.BadRequestException;
import com.votacao.pauta.models.Stave;
import com.votacao.pauta.repository.StaveRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StaveService {

    private StaveRepository staveRepository;

    public StaveService(StaveRepository staveRepository) {
        this.staveRepository = staveRepository;
    }

    public Stave insertStave(Stave stave) {
        if (stave.getDescription().isEmpty()) {
            throw new BadRequestException("Não é possível criar uma pauta sem descrição");
        } else {
            return staveRepository.save(stave);
        }
    }

    public Stave searchStave(Long id) {
        Optional<Stave> stave = staveRepository.findById(id);
        if (stave.isPresent()) {
            return stave.get();
        } else {
            throw new ObjectNotFoundException(id, Stave.class.getSimpleName());
        }
    }
}
