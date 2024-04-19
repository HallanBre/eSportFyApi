package com.esportfy.esportfyb.repository;

import com.esportfy.esportfyb.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
    Empresa findById(int id);
}
