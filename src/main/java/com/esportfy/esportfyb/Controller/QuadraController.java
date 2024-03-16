package com.esportfy.esportfyb.Controller;


import com.esportfy.esportfyb.dto.QuadraDto;
import com.esportfy.esportfyb.entities.Quadra;
import com.esportfy.esportfyb.entities.Usuario;
import com.esportfy.esportfyb.service.QuadraService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/quadra")
public class QuadraController {

    final
    QuadraService service;

    public QuadraController(QuadraService service) {
        this.service = service;
    }

    @PostMapping("/cadastro")
    public String cadastro(Quadra quadra){
        return service.salvar(quadra);
    }

    @GetMapping("/excluir/{id}")
    public String excluirQuadra(int id){
        return service.excluirQuadra(id);
    }
    @GetMapping("/buscaId/{id}")
    public QuadraDto getQuadra(int id){
        return service.buscaQuadra(id);
    }

    @GetMapping("/lista")
    public List<QuadraDto> getObject(){
        return service.listaQuadra();
    }
}
