package com.emily.pratica05.repository;

import com.emily.pratica05.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepo extends JpaRepository<Veiculo, Long> {
}
