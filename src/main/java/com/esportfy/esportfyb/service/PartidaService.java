package com.esportfy.esportfyb.service;

import com.esportfy.esportfyb.dto.PartidaDto;
import com.esportfy.esportfyb.entities.Partida;
import com.esportfy.esportfyb.entities.Quadra;
import com.esportfy.esportfyb.entities.Usuario;
import com.esportfy.esportfyb.repository.PartidaRepository;
import com.esportfy.esportfyb.repository.QuadraRepository;
import com.esportfy.esportfyb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import session.SessaoSistema;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartidaService {

    final
    QuadraRepository quadraRepository;


    private final PartidaRepository repository;

    private final UsuarioRepository usuarioRepository; // Injete o repositório, não a entidade

    @Autowired
    public PartidaService(PartidaRepository repository, QuadraRepository quadraRepository, UsuarioRepository usuarioRepository) {
        this.repository = repository;
        this.quadraRepository = quadraRepository;
        this.usuarioRepository = usuarioRepository;
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
        List<Partida> partidas = repository.findByDisponivelTrue();
        return partidas.stream().map(x -> new PartidaDto(x)).collect(Collectors.toList());
    }

    public List<PartidaDto> getPartidasDoUsuarioLogado() {
        Usuario usuarioLogado = SessaoSistema.getInstance().getUsuarioLogado();
        List<Partida> partidas = repository.findByUsuario(usuarioLogado);
        return partidas.stream().map(x -> new PartidaDto(x)).collect(Collectors.toList());
    }

    public String participarPartida(int id, int usuarioId){
        Partida partida = repository.findById(id);
        Usuario usuario = usuarioRepository.findById(usuarioId);
        if(partida.getNumeroJogadores() == partida.getUsuario().toArray().length){
            partida.setDisponibilidade(false);
            repository.save(partida);
            return "Usuário cadastrado com sucesso na partida";
        }else if (partida.getUsuario().contains(usuario)) {
            return "Erro: Usuário já está cadastrado na partida";
        }
        partida.adicionarUsuario(usuario);
        repository.save(partida);
        return "Usuário cadastrado com sucesso na partida";
    }


}
