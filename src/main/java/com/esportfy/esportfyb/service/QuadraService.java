package com.esportfy.esportfyb.service;


import com.esportfy.esportfyb.dto.QuadraDto;
import com.esportfy.esportfyb.entities.Quadra;
import com.esportfy.esportfyb.repository.CategoriaRepository;
import com.esportfy.esportfyb.repository.QuadraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuadraService {

    private final QuadraRepository repository;
    public QuadraService(QuadraRepository repository) {
        this.repository = repository;
    }
    @Autowired
    private CategoriaRepository categoriaRepository;



    public String CadastroQuadra(Quadra quadra){
        repository.save(quadra);
        return "";
    }
    public String excluirQuadra(int id){
        repository.deleteById(id);
        return "";
    }
    public QuadraDto buscaQuadra(int id){
        Quadra quadra = repository.findById(id);
        QuadraDto dto = new QuadraDto(quadra);
        return dto;
    }
    public List<QuadraDto> listaQuadra(){
        List<Quadra> quadras = repository.findAll();
        return quadras.stream().map(x -> new QuadraDto(x)).collect(Collectors.toList());
    }




}
