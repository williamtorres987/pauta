package com.votacao.pauta.controller;

import com.votacao.pauta.models.Usuario;
import com.votacao.pauta.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
@GetMapping("{id}")
    public Optional <Usuario> retornarUsuario (@PathVariable Long id) {
        return usuarioService.buscarUsuario(id);
    }
}
