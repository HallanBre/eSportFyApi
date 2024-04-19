package com.esportfy.esportfyb.dto;

import com.esportfy.esportfyb.entities.Pagamento;
import com.esportfy.esportfyb.entities.Partida;

public class PagamentoDto {
    private int id;
    private String forma;
    private String descricao;
    private Partida partida;

    public PagamentoDto(Pagamento pagamento) {
        this.id = pagamento.getId();
        this.forma = pagamento.getForma();
        this.descricao = pagamento.getDescricao();
        this.partida = pagamento.getPartida();
    }
    public PagamentoDto(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
}
