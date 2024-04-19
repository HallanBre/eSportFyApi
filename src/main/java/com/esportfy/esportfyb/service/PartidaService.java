package com.esportfy.esportfyb.service;

import com.esportfy.esportfyb.dto.PartidaDto;
import com.esportfy.esportfyb.entities.Partida;
import com.esportfy.esportfyb.repository.PartidaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartidaService {

    private final PartidaRepository repository;
    public PartidaService(PartidaRepository repository) {
        this.repository = repository;
    }

    public String CadastroPartida(Partida partida){
        repository.save(partida);
        return "";
    }
    public String excluiPartida(int id){
        repository.deleteById(id);
        return "";
    }
    public PartidaDto buscaPartida(int id){
        Partida partida = repository.findById(id);
        PartidaDto dto = new PartidaDto(partida);
        return dto;
    }
    public List<PartidaDto> listaPartida(){
        List<Partida> partidas = repository.findAll();
        return partidas.stream().map(x -> new PartidaDto(x)).collect(Collectors.toList());
    }
}
