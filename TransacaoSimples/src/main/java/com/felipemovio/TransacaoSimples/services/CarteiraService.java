package com.felipemovio.TransacaoSimples.services;

import com.felipemovio.TransacaoSimples.entity.Carteira;
import com.felipemovio.TransacaoSimples.repository.CarteiraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarteiraService {

    private final CarteiraRepository carteiraRepository;

    public void salvar(Carteira carteira){
        carteiraRepository.save(carteira);
    }
}
