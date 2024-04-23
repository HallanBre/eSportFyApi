package com.esportfy.esportfyb.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;
    private Boolean disponibilidade;
    private int numeroJogadores;
    private int tempoPartida;
    private String dataHora;
    @OneToOne(cascade ={CascadeType.ALL})
    @JoinColumn(name="quadra_id")
    private Quadra quadra;
    @OneToMany(mappedBy = "partida")
    private List<Usuario> usuario;

    public Partida(int id, String descricao, Boolean disponibilidade, int numeroJogadores, int tempoPartida,String dataHora,Quadra quadra, List<Usuario> usuario) {
        this.id = id;
        this.descricao = descricao;
        this.disponibilidade = disponibilidade;
        this.quadra = quadra;
        this.usuario = usuario;
        this.numeroJogadores = numeroJogadores;
        this.tempoPartida = tempoPartida;
        this.dataHora = dataHora;
    }


    public Partida() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
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

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
}
