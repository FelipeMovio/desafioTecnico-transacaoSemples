package com.felipemovio.TransacaoSimples.services;

import com.felipemovio.TransacaoSimples.entity.Usuario;
import com.felipemovio.TransacaoSimples.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;

    public Usuario buscarPorUsuario(Long id){
        return repository.findById(id).orElseThrow( () -> new RuntimeException("Usuário não encontrado") );
    }
}
