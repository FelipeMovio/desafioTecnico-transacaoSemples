package com.felipemovio.TransacaoSimples.services;

import com.felipemovio.TransacaoSimples.client.AutorizacaoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AutorizacaoService {
    private final AutorizacaoClient client;

    // Método para validar a transação
    public boolean validarTransacao(){
        return Objects.equals(client.validarAutorizacao().data().authorization(), "true");
    }
}
