package com.esportfy.esportfyb.service;

import com.esportfy.esportfyb.dto.EmpresaDto;
import com.esportfy.esportfyb.dto.EnderecoDto;
import com.esportfy.esportfyb.entities.Empresa;
import com.esportfy.esportfyb.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpresaService {
    private final EmpresaRepository repository;
    public EmpresaService(EmpresaRepository repository) {
        this.repository = repository;
    }

    public String CadastroEmpresa(Empresa empresa){
        repository.save(empresa);
        return "";
    }
    public String excluirEmpresa(int id){
        repository.deleteById(id);
        return "";
    }
    public EmpresaDto buscaEmpresa(int id){
        Empresa empresa = repository.findById(id);
        EmpresaDto dto = new EmpresaDto(empresa);
        return dto;
    }
    public List<EmpresaDto> listaEmpresa(){
        List<Empresa> empresas = repository.findAll();
        return empresas.stream().map(x -> new EmpresaDto(x)).collect(Collectors.toList());
    }
}
