package com.esportfy.esportfyb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int codigo;
    private String nome;
    private String uf;
    @OneToMany(mappedBy = "endereco", cascade = CascadeType.ALL)
    private List<Quadra> quadras;




    public Endereco(int id, int codigo, String nome, String uf, List<Quadra> quadras) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.uf = uf;
        this.quadras = quadras;
    }

    public Endereco() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<Quadra> getQuadras() {
        return quadras;
    }

    public void setQuadras(List<Quadra> quadras) {
        this.quadras = quadras;
    }
}
