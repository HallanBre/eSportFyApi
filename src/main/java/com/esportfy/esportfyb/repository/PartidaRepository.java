package com.esportfy.esportfyb.repository;

import com.esportfy.esportfyb.entities.Partida;
import com.esportfy.esportfyb.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartidaRepository extends JpaRepository<Partida, Integer> {
    Partida findById(int id);

    @Query("SELECT p FROM Partida p JOIN p.usuarios u WHERE u = :usuario")
    List<Partida> findByUsuario(Usuario usuario);
}
