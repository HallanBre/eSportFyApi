package com.esportfy.esportfyb.entities;

import jakarta.persistence.*;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String forma;
    private String descricao;

    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Partida partida;



    public Pagamento(int id, String forma, String descricao, Partida partida) {
        this.id = id;
        this.forma = forma;
        this.descricao = descricao;
        this.partida = partida;
    }
    public Pagamento(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
}
