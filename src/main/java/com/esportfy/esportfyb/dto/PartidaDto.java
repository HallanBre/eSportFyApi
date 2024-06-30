package com.esportfy.esportfyb.dto;

import com.esportfy.esportfyb.entities.Partida;
import com.esportfy.esportfyb.entities.Quadra;
import com.esportfy.esportfyb.entities.Usuario;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartidaDto {
    private int id;
    private String descricao;
    private Boolean disponibilidade;
    private int numeroJogadores;
    private int tempoPartida;
    private String dataHora;
    @Column(precision = 10 ,scale = 2)
    private BigDecimal valor;
    private Quadra quadra;
    @JsonManagedReference
    private List<Usuario> usuario;

    public PartidaDto(Partida partida) {
        this.id = partida.getId();
        this.descricao = partida.getDescricao();
        this.disponibilidade = partida.getDisponibilidade();
        this.quadra = partida.getQuadra();
        this.usuario = partida.getUsuario();
        this.numeroJogadores = partida.getNumeroJogadores();
        this.tempoPartida = partida.getTempoPartida();
        this.dataHora = partida.getDataHora();
        this.valor = partida.getValor();
    }


    public void adicionarUsuario(Usuario usuario) {
        if (this.usuario == null) {
            this.usuario = new ArrayList<>();
        }
        this.usuario.add(usuario);
    }
    public PartidaDto() {
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

    public String getData() {
        return dataHora;
    }
    public void setData(String data) {
        this.dataHora = data;
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
