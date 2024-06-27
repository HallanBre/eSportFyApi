package com.esportfy.esportfyb.controller;

import com.esportfy.esportfyb.dto.UsuarioDto;
import com.esportfy.esportfyb.entities.Usuario;
import com.esportfy.esportfyb.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    final
    UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }



    @GetMapping("/excluir/{id}")
    public String excluirUsuario(@PathVariable("id") int id){
        return service.excluirUsuario(id);
    }

    @GetMapping("/buscaId/{ids}")
    public List<UsuarioDto> getUsuarios(@PathVariable("ids") String ids){
        String[] idArray = ids.split(",");
        List<UsuarioDto> usuarios = new ArrayList<>();
        for (String idString : idArray) {
            try {
                int id = Integer.parseInt(idString);
                usuarios.add(service.buscaUsuario(id));
            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter id: " + idString);
            }
        }
        return usuarios;
    }

    @GetMapping("/lista")
    public List<UsuarioDto> getObject(){
        return service.listaUsuario();
    }
}
