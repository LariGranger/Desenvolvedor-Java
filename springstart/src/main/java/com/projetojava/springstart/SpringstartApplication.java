package com.projetojava.springstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringstartApplication {

	public static void main(String[] args) {
		 SpringApplication.run(SpringstartApplication.class, args);

        System.out.println("\n");
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║   API Cliente e Produtos                      ║");
        System.out.println("║   Spring Boot iniciado com sucesso!           ║");
        System.out.println("╠═══════════════════════════════════════════════╣");
        System.out.println("║   Acesse os endpoints:                        ║");
        System.out.println("║   http://localhost:8080/                      ║");
        System.out.println("║   http://localhost:8080/cliente               ║");
        System.out.println("║   http://localhost:8080/clientes              ║");
        System.out.println("║   http://localhost:8080/produtos              ║");
        System.out.println("║   http://localhost:8080/dados                 ║");
        System.out.println("║   http://localhost:8080/clientes-maiores-30   ║");
        System.out.println("║   http://localhost:8080/produtos-baratos      ║");
        System.out.println("║   http://localhost:8080/estatisticas          ║");
        System.out.println("╚═══════════════════════════════════════════════╝\n");
	}

}
