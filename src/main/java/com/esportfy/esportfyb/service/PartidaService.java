package com.esportfy.esportfyb.service;

import com.esportfy.esportfyb.dto.PartidaDto;
import com.esportfy.esportfyb.entities.Partida;
import com.esportfy.esportfyb.entities.Quadra;
import com.esportfy.esportfyb.repository.PartidaRepository;
import com.esportfy.esportfyb.repository.QuadraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartidaService {

    final
    QuadraRepository quadraRepository;

    private final PartidaRepository repository;
    public PartidaService(PartidaRepository repository, QuadraRepository quadraRepository) {
        this.repository = repository;
        this.quadraRepository = quadraRepository;
    }

    public String CadastroPartida( Partida partida){
        Quadra quadra = quadraRepository.findById(partida.getQuadra().getId());
        partida.setQuadra(quadra);
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
