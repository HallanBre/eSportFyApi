package com.esportfy.esportfyb.repository;


import com.esportfy.esportfyb.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    UserDetails findByName(String name);
    Usuario findById(int id);
    Usuario findByEmail(String email);


}
