package com.esportfy.esportfyb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private String superficie;
    @OneToMany
    private List<Quadra> quadra;


    public Categoria(int id, String nome, String descricao, String superficie, List<Quadra> quadra) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.superficie = superficie;
        this.quadra = quadra;
    }

    public Categoria() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public List<Quadra> getQuadra() {
        return quadra;
    }

    public void setQuadra(List<Quadra> quadra) {
        this.quadra = quadra;
    }
}
