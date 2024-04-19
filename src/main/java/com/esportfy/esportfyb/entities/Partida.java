package com.esportfy.esportfyb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;
    private Boolean disponibilidade;
    @OneToOne(cascade ={CascadeType.ALL})
    @JoinColumn(name="quadra_id")
    private Quadra quadra;
    @OneToMany
    @JoinColumn(name="usuario_id")
    private List<Usuario> usuario;

    public Partida(int id, String descricao, Boolean disponibilidade,Quadra quadra, List<Usuario> usuario) {
        this.id = id;
        this.descricao = descricao;
        this.disponibilidade = disponibilidade;
        this.quadra = quadra;
        this.usuario = usuario;
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
}
