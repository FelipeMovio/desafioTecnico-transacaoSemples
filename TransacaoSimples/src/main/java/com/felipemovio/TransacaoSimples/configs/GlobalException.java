package com.felipemovio.TransacaoSimples.configs;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> tratamentoDeExcessoes(IllegalArgumentException e){
        return new ResponseEntity<>("Erro : " + e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
