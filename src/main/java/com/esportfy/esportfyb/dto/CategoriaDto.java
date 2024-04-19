package com.esportfy.esportfyb.dto;

import com.esportfy.esportfyb.entities.Categoria;
import com.esportfy.esportfyb.entities.Quadra;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

public class CategoriaDto {

    private int id;
    private String nome;
    private String descricao;
    private String superficie;

    private List<Quadra> quadra;



    public CategoriaDto(Categoria categoria) {
        this.id = categoria.getId();
        this.nome = categoria.getNome();
        this.descricao = categoria.getDescricao();
        this.superficie = categoria.getSuperficie();
        this.quadra = categoria.getQuadra();
    }
    public CategoriaDto() {
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

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Quadra> getQuadra() {
        return quadra;
    }
    public void setQuadra(List<Quadra> quadra) {
        this.quadra = quadra;
    }

}
