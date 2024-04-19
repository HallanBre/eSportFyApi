package com.esportfy.esportfyb.controller;


import com.esportfy.esportfyb.dto.QuadraDto;
import com.esportfy.esportfyb.entities.Quadra;
import com.esportfy.esportfyb.service.QuadraService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quadra")
public class QuadraController {

    final
    QuadraService quadraService;

    public QuadraController(QuadraService quadraService) {
        this.quadraService = quadraService;
    }

    @GetMapping("/lista")
    public List<QuadraDto> listaQuadra(){
        return quadraService.listaQuadra();
    }

    @PostMapping("/salvar")
    public String cadastro(@RequestBody Quadra quadra){
        return quadraService.CadastroQuadra(quadra);
    }
    @GetMapping("/deletar/{id}")
    public String deletarQuadra(@PathVariable("id") int id){
        return quadraService.excluirQuadra(id);
    }
    @GetMapping("/buscar/{id}")
    public QuadraDto getObjectId(@PathVariable("id") int id){
        return quadraService.buscaQuadra(id);
    }



}
