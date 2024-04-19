package com.esportfy.esportfyb.dto;

import com.esportfy.esportfyb.entities.Partida;
import com.esportfy.esportfyb.entities.Quadra;
import com.esportfy.esportfyb.entities.Usuario;

import java.util.List;

public class PartidaDto {
    private int id;
    private String descricao;
    private Boolean disponibilidade;
    private Quadra quadra;
    private List<Usuario> usuario;

    public PartidaDto(Partida partida) {
        this.id = partida.getId();
        this.descricao = partida.getDescricao();
        this.disponibilidade = partida.getDisponibilidade();
        this.quadra = partida.getQuadra();
        this.usuario = partida.getUsuario();
    }
    public PartidaDto() {
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
