package com.votacao.pauta.service;

import com.votacao.pauta.models.Usuario;
import com.votacao.pauta.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Optional <Usuario> buscarUsuario(Long id) {
        return usuarioRepository.findById(id);
    }

}
