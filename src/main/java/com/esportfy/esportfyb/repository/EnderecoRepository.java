package com.esportfy.esportfyb.repository;

import com.esportfy.esportfyb.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    Endereco findById(int id);
}
