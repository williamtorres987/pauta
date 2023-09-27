package com.votacao.pauta.controller;

import com.votacao.pauta.models.Usuario;
import com.votacao.pauta.service.UsuarioService;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/{id}")
    public Usuario retornarUsuario(@PathVariable Long id) {
        return usuarioService.buscarUsuario(id);
    }

    @PostMapping("/inserir-usuario")
    public Usuario inserirUsuario(@RequestBody Usuario usuario) {
        return usuarioService.inserirUsuario(usuario);
    }
}

