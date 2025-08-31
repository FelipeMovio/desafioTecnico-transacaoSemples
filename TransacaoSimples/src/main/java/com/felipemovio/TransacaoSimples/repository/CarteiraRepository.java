package com.felipemovio.TransacaoSimples.repository;

import com.felipemovio.TransacaoSimples.entity.Carteira;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteiraRepository extends JpaRepository<Carteira, Long> {
}
