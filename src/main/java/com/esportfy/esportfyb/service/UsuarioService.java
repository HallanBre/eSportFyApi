package com.esportfy.esportfyb.service;


import com.esportfy.esportfyb.dto.UsuarioDto;
import com.esportfy.esportfyb.entities.Usuario;
import com.esportfy.esportfyb.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    final
    UsuarioRepository repository;


    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public UsuarioDto buscaUsuario(int id){
        Usuario usuario = repository.findById(id);
        UsuarioDto dto = new UsuarioDto(usuario);
        return dto;
    }
    public String excluirUsuario(int id){
        repository.deleteById(id);
        return "";
    }
    public List<UsuarioDto> listaUsuario(){
        List<Usuario> usuarios = repository.findAll();
        return usuarios.stream().map(x -> new UsuarioDto(x)).collect(Collectors.toList());
    }
}
