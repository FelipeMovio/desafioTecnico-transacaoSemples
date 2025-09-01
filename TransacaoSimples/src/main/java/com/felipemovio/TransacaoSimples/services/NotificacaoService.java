package com.felipemovio.TransacaoSimples.services;

import com.felipemovio.TransacaoSimples.client.AutorizacaoClient;
import com.felipemovio.TransacaoSimples.client.NotificacaoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class NotificacaoService {
    private final NotificacaoClient client;


    public void enviarNotificacao(){
        client.enviarNotificacao();
    }

}
