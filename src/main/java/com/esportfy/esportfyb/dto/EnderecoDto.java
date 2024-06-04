package com.esportfy.esportfyb.dto;

import com.esportfy.esportfyb.entities.Endereco;
import com.esportfy.esportfyb.entities.Quadra;
import com.esportfy.esportfyb.entities.Usuario;

import java.util.List;

public class EnderecoDto {
    private int id;
    private int codigo;
    private String nome;
    private String uf;
    private List<Quadra> quadra;


    public EnderecoDto(Endereco endereco) {
        this.id = endereco.getId();
        this.codigo = endereco.getCodigo();
        this.nome = endereco.getNome();
        this.uf = endereco.getUf();
        this.quadra = endereco.getQuadras();
    }
    public EnderecoDto() {
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

    public List<Quadra> getQuadra() {
        return quadra;
    }

    public void setQuadra(List<Quadra> quadra) {
        this.quadra = quadra;
    }
}
