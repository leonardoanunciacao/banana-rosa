package br.com.anunciarte.bananarosa.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Endereco {

    private String cep;
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public Endereco(Integer numero, String complemento, DadosEndereco dadosEndereco) {
        this.cep = dadosEndereco.cep();
        this.logradouro = dadosEndereco.logradouro();
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = dadosEndereco.bairro();
        this.localidade = dadosEndereco.localidade();
        this.uf = dadosEndereco.uf();
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "CEP: " + cep +
                ", Logradouro: " + logradouro +
                ", Número: " + numero +
                ", Complemento: " + complemento +
                ", Bairro: " + bairro +
                ", Localidade: " + localidade +
                ", UF: " + uf;
    }
}
