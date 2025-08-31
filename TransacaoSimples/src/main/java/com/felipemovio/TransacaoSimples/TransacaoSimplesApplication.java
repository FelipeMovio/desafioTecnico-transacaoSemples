package com.felipemovio.TransacaoSimples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TransacaoSimplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransacaoSimplesApplication.class, args);
	}

}
