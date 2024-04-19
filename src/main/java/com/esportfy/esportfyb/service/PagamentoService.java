package com.esportfy.esportfyb.service;

import com.esportfy.esportfyb.dto.PagamentoDto;
import com.esportfy.esportfyb.entities.Pagamento;
import com.esportfy.esportfyb.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PagamentoService {
    private final PagamentoRepository pagamentoRepository;

    public PagamentoService(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    public String CadastroPagamento(Pagamento pagamento){
        pagamentoRepository.save(pagamento);
        return "";
    }
    public String excluirPagamento(int id){
        pagamentoRepository.deleteById(id);
        return "";
    }
    public PagamentoDto buscaPagamento(int id){
        Pagamento pagamento = pagamentoRepository.findById(id);
        PagamentoDto dto = new PagamentoDto(pagamento);
        return dto;
    }
    public List<PagamentoDto> listaPagamento(){
        List<Pagamento> pagamentos = pagamentoRepository.findAll();
        return pagamentos.stream().map(x -> new PagamentoDto(x)).collect(Collectors.toList());
    }

}
