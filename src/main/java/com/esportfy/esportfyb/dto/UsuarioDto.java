package com.esportfy.esportfyb.dto;

import com.esportfy.esportfyb.entities.Endereco;
import com.esportfy.esportfyb.entities.Partida;
import com.esportfy.esportfyb.entities.Usuario;
import com.esportfy.esportfyb.enums.UserRole;

import java.util.List;

public class UsuarioDto {

    private int id;
    private String name;
    private String email;
    private String password;
    private String date;
    private UserRole role;
    private List<Endereco> endereco;
    private Partida partida;

    public UsuarioDto(Usuario usuario) {
        this.id = usuario.getId();
        this.name = usuario.getName();
        this.email = usuario.getEmail();
        this.password = usuario.getPassword();
        this.date = usuario.getDate();
        this.role = usuario.getRole();
        this.partida = usuario.getPartida();
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
    public String getRole() {
        return role.getRole();
    }
    public UsuarioDto setRole(UserRole role) {
        this.role = role;
        return this;
    }

    public int getId() {
        return id;
    }
    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
}
