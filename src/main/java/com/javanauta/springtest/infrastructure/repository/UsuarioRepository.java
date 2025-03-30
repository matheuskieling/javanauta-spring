package com.javanauta.springtest.infrastructure.repository;

import com.javanauta.springtest.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
