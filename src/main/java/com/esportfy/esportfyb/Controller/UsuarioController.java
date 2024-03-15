package com.esportfy.esportfyb.Controller;

import com.esportfy.esportfyb.dto.UsuarioDto;
import com.esportfy.esportfyb.entities.Usuario;
import com.esportfy.esportfyb.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    final
    UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping("/cadastro")
    public String cadastro( Usuario usuario){
        return service.salvar(usuario);
    }

    @GetMapping("/excluir/{id}")
    public String excluirUsuario(@PathVariable("id") int id){
        return service.excluirUsuario(id);
    }

    @GetMapping("/buscaId/{id}")
    public UsuarioDto getUsuario(@PathVariable("id") int id){
        return service.buscaUsuario(id);
    }

    @GetMapping("/lista")
    public List<UsuarioDto> getObject(){
        return service.listaUsuario();
    }
}
