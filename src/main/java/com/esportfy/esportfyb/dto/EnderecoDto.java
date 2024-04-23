package com.esportfy.esportfyb.dto;

import com.esportfy.esportfyb.entities.Endereco;
import com.esportfy.esportfyb.entities.Quadra;
import com.esportfy.esportfyb.entities.Usuario;

import java.util.List;

public class EnderecoDto {
    private int id;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private List<Usuario> usuario;
    private Quadra quadra;


    public EnderecoDto(Endereco endereco) {
        this.id = endereco.getId();
        this.rua = endereco.getRua();
        this.numero = endereco.getNumero();
        this.cidade = endereco.getCidade();
        this.bairro = endereco.getBairro();
        this.estado = endereco.getEstado();
        this.cep = endereco.getCep();
        this.quadra = endereco.getQuadra();
    }
    public EnderecoDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }
}
