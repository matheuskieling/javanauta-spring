package com.javanauta.springtest.business;

import com.javanauta.springtest.infrastructure.entity.Usuario;
import com.javanauta.springtest.infrastructure.exceptions.ConflictException;
import com.javanauta.springtest.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario salvaUsuario(Usuario usuario) {
        try {
            emailExiste(usuario.getEmail());
            return usuarioRepository.save(usuario);
        } catch(ConflictException e) {
            throw new ConflictException(e.getMessage(), e.getCause());
        }
    }

    public void emailExiste(String email) {
        try {
            Boolean existe = verificaEmailJaExistente(email);
            if (existe) {
                throw new ConflictException("Email já existente: " + email);
            }
        } catch (ConflictException e) {
            throw new ConflictException(e.getMessage(), e.getCause());
        }

    }

    public Boolean verificaEmailJaExistente(String email) {
        return usuarioRepository.existsByEmail(email);
    }
}
