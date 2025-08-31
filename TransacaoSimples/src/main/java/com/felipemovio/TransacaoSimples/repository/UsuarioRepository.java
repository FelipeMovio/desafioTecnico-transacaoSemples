package com.felipemovio.TransacaoSimples.repository;

import com.felipemovio.TransacaoSimples.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
