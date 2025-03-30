package com.javanauta.springtest.infrastructure.repository;

import com.javanauta.springtest.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
