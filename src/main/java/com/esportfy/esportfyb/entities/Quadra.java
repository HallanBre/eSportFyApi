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
    private int type;
    @ManyToOne
    private Categoria categoria;
    @OneToMany(cascade ={CascadeType.ALL})
    @JoinColumn(name="endereco_id")
    private List<Endereco> endereco;
    @OneToOne(cascade ={CascadeType.ALL})
    @JoinColumn(name="partida_id")
    private Partida partida;


    public Quadra(int id, int numeroJogadores, int tempoPartida,List<Endereco> endereco, Categoria categoria,Partida partida,int type) {
        this.id = id;
        this.numeroJogadores = numeroJogadores;
        this.tempoPartida = tempoPartida;
        this.endereco = endereco;
        this.categoria = categoria;
        this.partida = partida;
        this.type = type;

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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

