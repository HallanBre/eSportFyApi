package com.esportfy.esportfyb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Quadra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    @ManyToOne
    @JoinColumn(name="categoria_id")
    private Categoria categoria;
    @ManyToOne
    private Empresa empresa;
    @OneToMany(cascade ={CascadeType.ALL})
    @JoinColumn(name="endereco_id")
    private List<Endereco> endereco;
    @OneToOne(cascade ={CascadeType.ALL})
    @JoinColumn(name="partida_id")
    private Partida partida;


    public Quadra(int id,String nome,List<Endereco> endereco, Categoria categoria,Partida partida,Empresa empresa) {
        this.id = id;
        this.endereco = endereco;
        this.categoria = categoria;
        this.partida = partida;
        this.empresa = empresa;
        this.nome = nome;

    }

    public Quadra() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

