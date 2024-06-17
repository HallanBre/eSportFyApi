package com.esportfy.esportfyb.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;
import java.text.DecimalFormat;
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
    @Column(precision = 10, scale = 2)
    private BigDecimal valor;
    @ManyToOne(cascade ={CascadeType.ALL})
    @JoinColumn(name="quadra_id")
    @JsonBackReference
    private Quadra quadra;
    @ManyToMany(mappedBy = "partida")
    @JsonManagedReference
    private List<Usuario> usuario;

    public Partida(int id, String descricao, Boolean disponibilidade, int numeroJogadores, int tempoPartida,String dataHora,Quadra quadra, List<Usuario> usuario, BigDecimal valor) {
        this.id = id;
        this.descricao = descricao;
        this.disponibilidade = disponibilidade;
        this.quadra = quadra;
        this.usuario = usuario;
        this.numeroJogadores = numeroJogadores;
        this.tempoPartida = tempoPartida;
        this.dataHora = dataHora;
        this.valor = valor;
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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {

        this.valor = valor;
    }
}
