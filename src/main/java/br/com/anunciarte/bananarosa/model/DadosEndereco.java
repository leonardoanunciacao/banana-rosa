package br.com.anunciarte.bananarosa.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEndereco(@JsonAlias("cep") String cep,
                            @JsonAlias("logradouro") String logradouro,
                            @JsonAlias("bairro") String bairro,
                            @JsonAlias("localidade") String localidade,
                            @JsonAlias("uf") String uf) {
    @Override
    public String toString() {
        return "CEP: " + cep +
                ", Logradouro: " + logradouro +
                ", Bairro: " + bairro +
                ", Localidade: " + localidade +
                ", UF: " + uf;
    }
}
