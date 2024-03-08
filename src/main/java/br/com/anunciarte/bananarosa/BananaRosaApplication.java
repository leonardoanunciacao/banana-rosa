package br.com.anunciarte.bananarosa;

import br.com.anunciarte.bananarosa.model.DadosEndereco;
import br.com.anunciarte.bananarosa.service.ConsumoAPI;
import br.com.anunciarte.bananarosa.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BananaRosaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BananaRosaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.principal();
	}
}
