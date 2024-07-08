package com.esportfy.esportfyb.repository;

import com.esportfy.esportfyb.entities.Empresa;
import com.esportfy.esportfyb.entities.Partida;
import com.esportfy.esportfyb.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartidaRepository extends JpaRepository<Partida, Integer> {
    Partida findById(int id);

    @Query("SELECT p FROM Partida p JOIN p.usuarios u WHERE u = :usuario")
    List<Partida> findByUsuario(Usuario usuario);

    @Query("SELECT p FROM Partida p WHERE p.disponibilidade = true")
    List<Partida> findByDisponivelTrue();

    @Query("SELECT p FROM Partida p WHERE p.quadra.endereco.id = :municipioId")
    List<Partida> findByMunicipioId(int municipioId);
    @Query("SELECT p FROM Partida p WHERE p.quadra.empresa = :empresa")
    List<Partida> findByEmpresa(Empresa empresa);

    @Modifying
    @Query(value = "DELETE FROM partida_usuario WHERE partida_id = :partidaId AND usuario_id = :usuarioId", nativeQuery = true)
    void removeUsuarioFromPartida(int partidaId, int usuarioId);

    @Query("SELECT p FROM Partida p JOIN p.usuarios u WHERE u = :usuario")
    List<Partida> findAllByUsuario(Usuario usuario);
}
