package com.esportfy.esportfyb.dto;

import com.esportfy.esportfyb.entities.Empresa;
import com.esportfy.esportfyb.entities.Quadra;

import java.util.List;

public class EmpresaDto {

    private int id;
    private String razaoRosial;
    private String nome;
    private String cnpj;
    private String contato;
    private String email;
    private List<Quadra> quadra;

    public EmpresaDto(Empresa empresa){
        this.id = empresa.getId();
        this.razaoRosial = empresa.getRazaoRosial();
        this.nome = empresa.getNome();
        this.cnpj = empresa.getCnpj();
        this.contato = empresa.getContato();
        this.email = empresa.getEmail();
        this.quadra = empresa.getQuadra();

    }

    public EmpresaDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazaoRosial() {
        return razaoRosial;
    }

    public void setRazaoRosial(String razaoRosial) {
        this.razaoRosial = razaoRosial;
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
