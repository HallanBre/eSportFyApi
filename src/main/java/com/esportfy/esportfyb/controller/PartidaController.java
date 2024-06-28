package com.esportfy.esportfyb.controller;

import com.esportfy.esportfyb.dto.PartidaDto;
import com.esportfy.esportfyb.entities.Partida;
import com.esportfy.esportfyb.entities.Usuario;
import com.esportfy.esportfyb.service.PartidaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import session.SessaoSistema;

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
    @GetMapping("/partidasUsuario")
    public List<PartidaDto> getPartidasDoUsuarioLogado() {
        return partidaService.getPartidasDoUsuarioLogado();
    }
    @PostMapping("/salvar")
    public String cadastro(@RequestBody Partida partida){
        return partidaService.CadastroPartida(partida);
    }
    @PostMapping("/participar/{id}")
        public String participar(@PathVariable int id){
            Usuario usuario = SessaoSistema.getInstance().getUsuarioLogado();
            return partidaService.participarPartida(id, usuario.getId());
        }
    @GetMapping("/deletar/{id}")
    public String deletarPartida(int id){
        return partidaService.excluiPartida(id);
    }
    @GetMapping("/buscar/{id}")
    public PartidaDto getObjectId(@PathVariable int id){
        return partidaService.buscaPartida(id);
    }

}
