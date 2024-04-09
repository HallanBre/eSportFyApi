package com.esportfy.esportfyb.dto;

import com.esportfy.esportfyb.entities.Quadra;

public class QuadraDto {

    private int id;
    private int numeroJogadores;
    private int tempoPartida;

    public QuadraDto(Quadra quadra) {
        this.id = quadra.getId();
        this.numeroJogadores = quadra.getNumeroJogadores();
        this.tempoPartida = quadra.getTempoPartida();
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
}
