package com.esportfy.esportfyb.dto;

import com.esportfy.esportfyb.entities.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;

public class QuadraDto {

    private int id;
    private String nome;
    private String detalheEndereco;
    private Categoria categoria;
    private Empresa empresa;
    private Endereco endereco;
    @JsonManagedReference
    private List<Partida> partida;



    public QuadraDto(Quadra quadra) {
        this.id = quadra.getId();
        this.endereco = quadra.getEndereco();
        this.categoria = quadra.getCategoria();
        this.partida = quadra.getPartida();
        this.empresa = quadra.getEmpresa();
        this.nome = quadra.getNome();
        this.detalheEndereco = quadra.getDetalheEndereco();
    }
    public QuadraDto() {
    }

    public QuadraDto(int id, String nome, String descricao) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Partida> getPartida() {
        return partida;
    }

    public void setPartida(List<Partida> partida) {
        this.partida = partida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDetalheEndereco() {
        return detalheEndereco;
    }

    public void setDetalheEndereco(String detalheEndereco) {
        this.detalheEndereco = detalheEndereco;
    }
}
