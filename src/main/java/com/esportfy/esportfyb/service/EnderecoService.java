package com.esportfy.esportfyb.service;

import com.esportfy.esportfyb.dto.EnderecoDto;
import com.esportfy.esportfyb.entities.Endereco;
import com.esportfy.esportfyb.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnderecoService {

    private final EnderecoRepository repository;
    public EnderecoService(EnderecoRepository repository) {
        this.repository = repository;
    }

    public String CadastroEndereco(Endereco endereco){
        repository.save(endereco);
        return "";
    }
    public String excluirEndereco(int id){
        repository.deleteById(id);
        return "";
    }
    public EnderecoDto buscaEndereco(int id){
        Endereco endereco = repository.findById(id);
        EnderecoDto dto = new EnderecoDto(endereco);
        return dto;
    }
    public List<EnderecoDto> listaEndereco(){
        List<Endereco> enderecos = repository.findAll();
        return enderecos.stream().map(x -> new EnderecoDto(x)).collect(Collectors.toList());
    }

}
