package com.esportfy.esportfyb.repository;


import com.esportfy.esportfyb.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findById(int id);

}
