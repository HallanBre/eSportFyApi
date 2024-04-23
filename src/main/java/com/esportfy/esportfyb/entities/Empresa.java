package com.esportfy.esportfyb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String razaoSocial;
    private String nome;
    private String cnpj;
    private String contato;
    private String email;
    @OneToMany
    @JoinColumn(name="quadra_id")
    private List<Quadra> quadra;

    public Empresa(int id, String razaoSocial, String nome, String cnpj, String contato, String email, List<Quadra> quadra) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.nome = nome;
        this.cnpj = cnpj;
        this.contato = contato;
        this.email = email;
        this.quadra = quadra;
    }

    public Empresa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazaoRosial() {
        return razaoSocial;
    }

    public void setrazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Quadra> getQuadra() {
        return quadra;
    }

    public void setQuadra(List<Quadra> quadra) {
        this.quadra = quadra;
    }
}
