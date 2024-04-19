package com.esportfy.esportfyb.controller;

import com.esportfy.esportfyb.dto.EmpresaDto;
import com.esportfy.esportfyb.entities.Empresa;
import com.esportfy.esportfyb.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping("/lista")
    public List<EmpresaDto> listaEmpresa(){
        return empresaService.listaEmpresa();
    }
    @PostMapping("/salvar")
    public String cadastro(Empresa empresa){
        return empresaService.CadastroEmpresa(empresa);
    }
    @GetMapping("/deletar/{id}")
    public String deletarEmpresa(int id){
        return empresaService.excluirEmpresa(id);
    }
    @GetMapping("/buscar/{id}")
    public EmpresaDto getObjectId(int id){
        return empresaService.buscaEmpresa(id);
    }
}
