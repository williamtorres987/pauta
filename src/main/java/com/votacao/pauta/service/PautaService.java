package com.votacao.pauta.service;

import com.votacao.pauta.repository.PautaInterface;
import org.springframework.stereotype.Service;

@Service
public class PautaService {
    private PautaInterface pautaInterface;

    public PautaService(PautaInterface pautaInterface) {
        this.pautaInterface = pautaInterface;
    }
}
