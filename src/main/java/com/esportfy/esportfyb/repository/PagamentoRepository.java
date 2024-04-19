package com.esportfy.esportfyb.repository;

import com.esportfy.esportfyb.entities.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
    Pagamento findById(int id);

}
