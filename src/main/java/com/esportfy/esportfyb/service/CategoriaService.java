package com.esportfy.esportfyb.service;


import com.esportfy.esportfyb.dto.CategoriaDto;
import com.esportfy.esportfyb.entities.Categoria;
import com.esportfy.esportfyb.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaService {
    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }


    public String CadastroCategoria(Categoria categoria){
        repository.save(categoria);
        return "";
    }
    public String excluirCategoria(int id){
        repository.deleteById(id);
        return "";
    }
    public CategoriaDto buscaCategoria(int id){
        Categoria categoria = repository.findById(id);
        CategoriaDto dto = new CategoriaDto(categoria);
        return dto;
    }
    public List<CategoriaDto> listaCategoria(){
        List<Categoria> categorias = repository.findAll();
        return categorias.stream().map(x -> new CategoriaDto(x)).collect(Collectors.toList());
    }
}
