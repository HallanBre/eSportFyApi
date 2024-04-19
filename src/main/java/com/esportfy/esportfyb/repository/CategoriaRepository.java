package com.esportfy.esportfyb.repository;

import com.esportfy.esportfyb.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    Categoria findById(int id);
}
