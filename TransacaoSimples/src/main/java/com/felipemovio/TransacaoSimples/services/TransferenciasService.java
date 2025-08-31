package com.felipemovio.TransacaoSimples.services;


import com.felipemovio.TransacaoSimples.DTO.TransacaoDTO;
import com.felipemovio.TransacaoSimples.entity.TipoUsuario;
import com.felipemovio.TransacaoSimples.entity.Usuario;
import com.felipemovio.TransacaoSimples.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class TransferenciasService {

    private final UsuarioService usuarioService;

    private final AutorizacaoService autorizacaoService;

    public void transferirValores(TransacaoDTO transacaoDTO){
        // Lógica de transferência de valores entre contas
        Usuario pagador = usuarioService.buscarPOrUsuario(transacaoDTO.payer());
        Usuario recebedor = usuarioService.buscarPOrUsuario(transacaoDTO.payee());
        validarPagador(pagador);
        validarSaldoUsuario(pagador, transacaoDTO.value());
        validarTransferencia();

    }

    //validar se nosso pagador naob é um lojista
    private void validarPagador(Usuario usuario){
        try {
            if (usuario.getTipoUsuario().equals(TipoUsuario.LOJISTA)){
                throw new IllegalArgumentException("Lojistas não podem realizar transferências.");
            }
        }catch (Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    // validar saldo usuario
    private void validarSaldoUsuario(Usuario usuario, BigDecimal valor){

        try {
            if (usuario.getCarteira().getSaldo().compareTo(valor) < 0){
                throw new IllegalArgumentException("Saldo insuficiente para realizar a transferência.");
            }
        }catch (Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }

    }

    // validar transação
    private void validarTransferencia(){
        try {
            if (!autorizacaoService.validarTransacao()){
                throw new IllegalArgumentException("Transação não autorizada pela API.");
            }
        }catch (Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
