package com.esportfy.esportfyb.repository;


import com.esportfy.esportfyb.entities.Quadra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuadraRepository extends JpaRepository<Quadra, Integer> {
    Quadra findById(int id);
}
