package br.com.anunciarte.bananarosa.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record EnderecoDados (@JsonAlias("cep") String cep,
                             @JsonAlias("logradouro") String logradouro,
                             @JsonAlias("bairro") String bairro,
                             @JsonAlias("localidade") String localidade,
                             @JsonAlias("uf") String uf) {
}
