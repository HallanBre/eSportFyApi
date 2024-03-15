package com.esportfy.esportfyb.dto;

import com.esportfy.esportfyb.entities.Usuario;

public class UsuarioDto {

    private int id;
    private String name;
    private String email;
    private String password;
    private String date;

    public UsuarioDto(Usuario usuario) {
        this.id = usuario.getId();
        this.name = usuario.getName();
        this.email = usuario.getEmail();
        this.password = usuario.getPassword();
        this.date = usuario.getDate();
    }

    public int id() {
        return id;
    }

    public UsuarioDto setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UsuarioDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UsuarioDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UsuarioDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDate() {
        return date;
    }

    public UsuarioDto setDate(String date) {
        this.date = date;
        return this;
    }
}
