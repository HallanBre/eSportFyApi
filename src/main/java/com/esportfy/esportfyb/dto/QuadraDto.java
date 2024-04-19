package com.esportfy.esportfyb.dto;

import com.esportfy.esportfyb.entities.*;

import java.util.List;

public class QuadraDto {

    private int id;
    private int numeroJogadores;
    private int tempoPartida;
    private Categoria categoria;
    private Empresa empresa;
    private List<Endereco> endereco;
    private Partida partida;



    public QuadraDto(Quadra quadra) {
        this.id = quadra.getId();
        this.numeroJogadores = quadra.getNumeroJogadores();
        this.tempoPartida = quadra.getTempoPartida();
        this.endereco = quadra.getEndereco();
        this.categoria = quadra.getCategoria();
        this.partida = quadra.getPartida();
        this.empresa = quadra.getEmpresa();
    }
    public QuadraDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroJogadores() {
        return numeroJogadores;
    }

    public void setNumeroJogadores(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }

    public int getTempoPartida() {
        return tempoPartida;
    }

    public void setTempoPartida(int tempoPartida) {
        this.tempoPartida = tempoPartida;
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

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
}
