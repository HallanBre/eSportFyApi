package com.esportfy.esportfyb.controller;

import com.esportfy.esportfyb.dto.PartidaDto;
import com.esportfy.esportfyb.entities.Partida;
import com.esportfy.esportfyb.service.PartidaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/partida")
public class PartidaController {

    final PartidaService partidaService;

    public PartidaController(PartidaService partidaService) {
        this.partidaService = partidaService;
    }

    @GetMapping("/lista")
    public List<PartidaDto> listaPartida(){
        return partidaService.listaPartida();
    }
    @PostMapping("/salvar")
    public String cadastro(Partida partida){
        return partidaService.CadastroPartida(partida);
    }
    @GetMapping("/deletar/{id}")
    public String deletarPartida(int id){
        return partidaService.excluiPartida(id);
    }
    @GetMapping("/buscar/{id}")
    public PartidaDto getObjectId(int id){
        return partidaService.buscaPartida(id);
    }
}
