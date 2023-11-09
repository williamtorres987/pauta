package com.votacao.pauta.controller;
import com.votacao.pauta.models.Vote;
import com.votacao.pauta.service.VoteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vote")
public class VoteController {
    private VoteService voteService;
    public VoteController (VoteService voteService) { this.voteService = voteService;}

    @GetMapping("{id}")
    public Vote getVote(@PathVariable Long id) {
        return voteService.searchVote(id);
    }

    @PostMapping("/insert-vote")
    public Vote insertVote (@RequestBody Vote vote) {
        return voteService.insertVote(vote);
    }
}

