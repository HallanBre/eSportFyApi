package com.esportfy.esportfyb.service;

import com.esportfy.esportfyb.dto.PartidaDto;
import com.esportfy.esportfyb.entities.*;
import com.esportfy.esportfyb.repository.EnderecoRepository;
import com.esportfy.esportfyb.repository.PartidaRepository;
import com.esportfy.esportfyb.repository.QuadraRepository;
import com.esportfy.esportfyb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import session.SessaoSistema;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartidaService {

    final
    QuadraRepository quadraRepository;


    private final PartidaRepository repository;
    private final EnderecoRepository enderecoRepository;
    private final UsuarioRepository usuarioRepository; // Injete o repositório, não a entidade

    @Autowired
    public PartidaService(PartidaRepository repository, QuadraRepository quadraRepository, EnderecoRepository enderecoRepository, UsuarioRepository usuarioRepository) {
        this.repository = repository;
        this.quadraRepository = quadraRepository;
        this.enderecoRepository = enderecoRepository;
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

    public List<PartidaDto> getPartidasDaEmpresaDoUsuarioLogado() {
        Usuario usuarioLogado = SessaoSistema.getInstance().getUsuarioLogado();
        Empresa empresa = usuarioLogado.getEmpresa();
        List<Partida> partidas = repository.findByEmpresa(empresa);
        return partidas.stream().map(x -> new PartidaDto(x)).collect(Collectors.toList());
    }

    public String participarPartida(int id, int usuarioId){
        Partida partida = repository.findById(id);
        Usuario usuario = usuarioRepository.findById(usuarioId);
        if((partida.getNumeroJogadores()-1) == partida.getUsuario().toArray().length){
            partida.setDisponibilidade(false);
            partida.adicionarUsuario(usuario);
            repository.save(partida);
            return "Usuário cadastrado com sucesso na partida";
        }else if (partida.getUsuario().contains(usuario)) {
            return "Erro: Usuário já está cadastrado na partida";
        }else if (isUserInAnotherMatchAtTheSameTime(usuario, partida)) {
            return "Erro: Usuário já está cadastrado em outra partida no mesmo horário";
        }
        partida.adicionarUsuario(usuario);
        repository.save(partida);
        return "Usuário cadastrado com sucesso na partida";
    }

    @Transactional
    public String sairPartida(int id){
        Usuario usuarioLogado = SessaoSistema.getInstance().getUsuarioLogado();
        Partida partida = repository.findById(id);
        if(partida.getUsuario().stream().anyMatch(u -> u.getId() == usuarioLogado.getId())) {
            repository.removeUsuarioFromPartida(id, usuarioLogado.getId());
            partida.setDisponibilidade(true);
            repository.save(partida);

            return "Usuário saiu da partida com sucesso";
        } else {
            return "Erro: Usuário não está na partida";
        }
    }

    public List<PartidaDto> listaPartidasPorMunicipioId(int municipioId){
        List<Partida> partidas = repository.findByMunicipioId(municipioId);
        return partidas.stream().map(PartidaDto::new).collect(Collectors.toList());
    }

    public boolean isUserInAnotherMatchAtTheSameTime(Usuario usuario, Partida newPartida) {
        List<Partida> partidas = repository.findAllByUsuario(usuario);
        for (Partida partida : partidas) {
            if (partida.getDataHora().equals(newPartida.getDataHora())) {
                return true;
            }
        }
        return false;
    }





}
