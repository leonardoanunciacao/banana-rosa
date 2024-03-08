package br.com.anunciarte.bananarosa;

import br.com.anunciarte.bananarosa.model.DadosEndereco;
import br.com.anunciarte.bananarosa.model.Endereco;
import br.com.anunciarte.bananarosa.service.ConsumoAPI;
import br.com.anunciarte.bananarosa.service.ConverteDados;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConverteDados converteDados = new ConverteDados();
    private final String ENDERECO = "https://viacep.com.br/ws/";
    private final String ENDERECO_JSON = "/json/";

    public void principal(){
    cadastraEndereco();
    }

    public DadosEndereco buscaEndereco(){
        System.out.println("Digite o CEP: ");
        var cepBuscado = leitura.nextLine();
        var json = consumoAPI.obterDados(ENDERECO + cepBuscado + ENDERECO_JSON);
        DadosEndereco dadosEndereco = converteDados.obterDados(json, DadosEndereco.class);
        System.out.println("Endereço buscado:\n" + dadosEndereco);
        return dadosEndereco;
    }

    public void cadastraEndereco(){
        DadosEndereco dadosEndereco = buscaEndereco();

        System.out.println("Digite o número: ");
        var numero = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Digite o complemento: ");
        var complemento = leitura.nextLine();

        Endereco endereco = new Endereco(numero, complemento, dadosEndereco);
        System.out.println("Endereço cadastrado:\n" + endereco);
    }
}
