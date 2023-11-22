package com.votacao.pauta.service;

import com.votacao.pauta.models.Stave;
import com.votacao.pauta.models.Vote;
import com.votacao.pauta.repository.StaveRepository;
import com.votacao.pauta.repository.VoteRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VoteService {

    private VoteRepository voteRepository;
    private StaveRepository staveRepository;

    public VoteService(VoteRepository voteRepository, StaveRepository staveRepository) {
        this.voteRepository = voteRepository;
        this.staveRepository = staveRepository;
    }

    public Vote insertVote(Vote vote) {
        Optional<Stave> stave = staveRepository.findById(vote.getIdStave());
        if (stave.isPresent()) {
            return voteRepository.save(vote);

        } else {
            throw new ObjectNotFoundException(stave.get().getId(), Stave.class.getSimpleName());
        }
    }

    public Vote searchVote(Long id) {
        Optional<Vote> vote = voteRepository.findById(id);
        if (vote.isPresent()) {
            return (vote.get());
        } else {
            throw new ObjectNotFoundException(id, Vote.class.getSimpleName());
        }
    }
}
