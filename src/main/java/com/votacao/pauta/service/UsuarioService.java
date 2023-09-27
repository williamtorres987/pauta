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

    public Usuario buscarUsuario(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (usuario.isPresent()) {
            return usuario.get();
        } else {
            throw new RuntimeException("Usuário Inexistente.");
        }
    }

    public Usuario inserirUsuario( Usuario usuario) {
        if (usuario.getNome().isEmpty()) {
            throw new RuntimeException("Não é possível criar um usuário com nome vazio");
        } else {
            return usuarioRepository.save(usuario);
        }
    }
}
