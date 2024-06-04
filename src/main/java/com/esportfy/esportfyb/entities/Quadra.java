package com.esportfy.esportfyb.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Quadra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String detalheEndereco;
    @ManyToOne
    @JoinColumn(name="categoria_id")
    private Categoria categoria;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    @JoinColumn(name="endereco_id")
    private Endereco endereco;
    @OneToMany(cascade ={CascadeType.ALL}, mappedBy ="quadra")
    @JsonManagedReference
    private List<Partida> partida;

    @Override
    public String toString() {
        return "Quadra{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", categoria=" + categoria +
                ", empresa=" + empresa +
                ", endereco=" + endereco +
                ", partida=" + partida +
                '}';
    }

    public Quadra(int id, String nome, Endereco endereco, Categoria categoria, List<Partida> partida, Empresa empresa, String detalheEndereco) {
        this.id = id;
        this.endereco = endereco;
        this.categoria = categoria;
        this.partida = partida;
        this.empresa = empresa;
        this.nome = nome;
        this.detalheEndereco = detalheEndereco;

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Partida> getPartida() {
        return partida;
    }

    public void setPartida(List<Partida> partida) {
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

    public String getDetalheEndereco() {
        return detalheEndereco;
    }

    public void setDetalheEndereco(String detalheEndereco) {
        this.detalheEndereco = detalheEndereco;
    }
}

