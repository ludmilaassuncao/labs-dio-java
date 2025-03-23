package com.banking.banco;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
    info = @Info(title = "Banking API", version = "1.0", description = "API para gerenciamento de contas e transações bancárias")
)
@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

}
