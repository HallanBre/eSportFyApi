package com.esportfy.esportfyb.controller;

import com.esportfy.esportfyb.dto.CategoriaDto;

import com.esportfy.esportfyb.entities.Categoria;
import com.esportfy.esportfyb.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    final
    CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/lista")
    public List<CategoriaDto> listaCategoria(){
        return categoriaService.listaCategoria();
    }
    @PostMapping("/salvar")
    public String cadastro(Categoria categoria){
        return categoriaService.CadastroCategoria(categoria);
    }
    @GetMapping("/deletar/{id}")
    public String deletarCategoria(@PathVariable("id") int id){
        return categoriaService.excluirCategoria(id);
    }
    @GetMapping("/buscar/{id}")
    public CategoriaDto getObjectId(@PathVariable("id") int id){
        return categoriaService.buscaCategoria(id);
    }
}
