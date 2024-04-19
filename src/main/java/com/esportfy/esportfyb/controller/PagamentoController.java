package com.esportfy.esportfyb.controller;

import com.esportfy.esportfyb.dto.PagamentoDto;
import com.esportfy.esportfyb.entities.Pagamento;
import com.esportfy.esportfyb.service.PagamentoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {

    final PagamentoService pagamentoService;
    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }
    @GetMapping("/lista")
    public List<PagamentoDto> listaPagamento(){
        return pagamentoService.listaPagamento();
    }
    @PostMapping("/salvar")
    public String cadastro(Pagamento pagamento){
        return pagamentoService.CadastroPagamento(pagamento);
    }
    @GetMapping("/deletar/{id}")
    public String deletarPagamento(int id){
        return pagamentoService.excluirPagamento(id);
    }
    @GetMapping("/buscar/{id}")
    public PagamentoDto getObjectId(int id){
        return pagamentoService.buscaPagamento(id);
    }


}
