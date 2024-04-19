package com.esportfy.esportfyb.controller;

import com.esportfy.esportfyb.dto.EnderecoDto;
import com.esportfy.esportfyb.entities.Endereco;
import com.esportfy.esportfyb.service.EnderecoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    final
    EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping("/lista")
    public List<EnderecoDto> listaEndereco(){
        return enderecoService.listaEndereco();
    }
    @PostMapping("/salvar")
    public String cadastro(Endereco endereco){
        return enderecoService.CadastroEndereco(endereco);
    }
    @GetMapping("/deletar/{id}")
    public String deletarEndereco(int id){
        return enderecoService.excluirEndereco(id);
    }
    @GetMapping("/buscar/{id}")
    public EnderecoDto getObjectId(int id){
        return enderecoService.buscaEndereco(id);
    }
}
