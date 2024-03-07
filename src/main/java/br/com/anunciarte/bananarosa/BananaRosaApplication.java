package br.com.anunciarte.bananarosa;

import br.com.anunciarte.bananarosa.model.EnderecoDados;
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
		ConsumoAPI consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://viacep.com.br/ws/06026000/json/");
		System.out.println(json);
		ConverteDados converteDados = new ConverteDados();
		EnderecoDados enderecoDados = converteDados.obterDados(json, EnderecoDados.class);
		System.out.println(enderecoDados);
	}
}
