package com.esportfy.esportfyb.dto;

import com.esportfy.esportfyb.entities.Partida;

public class PartidaDto {
    private int id;
    private String descricao;
    private Boolean disponibilidade;

    public PartidaDto(Partida partida) {
        this.id = partida.getId();
        this.descricao = partida.getDescricao();
        this.disponibilidade = partida.getDisponibilidade();
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
}
