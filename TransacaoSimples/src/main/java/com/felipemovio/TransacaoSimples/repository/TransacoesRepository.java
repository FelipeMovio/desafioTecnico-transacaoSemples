package com.felipemovio.TransacaoSimples.repository;

import com.felipemovio.TransacaoSimples.entity.Transacoes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacoesRepository extends JpaRepository<Transacoes, Long> {
}
