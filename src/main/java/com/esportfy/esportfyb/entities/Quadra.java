package com.esportfy.esportfyb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Quadra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numeroJogadores;
    private int tempoPartida;
    @ManyToOne
    private Categoria categoria;

    //Endereço_ID


    public Quadra(int id, int numeroJogadores, int tempoPartida) {
        this.id = id;
        this.numeroJogadores = numeroJogadores;
        this.tempoPartida = tempoPartida;

    }

    public Quadra() {
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
