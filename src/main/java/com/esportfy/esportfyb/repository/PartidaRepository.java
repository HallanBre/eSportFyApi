package com.esportfy.esportfyb.repository;

import com.esportfy.esportfyb.entities.Partida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidaRepository extends JpaRepository<Partida, Integer> {
    Partida findById(int id);
}
