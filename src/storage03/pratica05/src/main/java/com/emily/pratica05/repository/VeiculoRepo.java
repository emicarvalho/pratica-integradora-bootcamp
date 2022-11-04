package com.emily.pratica05.repository;

import com.emily.pratica05.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculoRepo extends JpaRepository<Veiculo, Integer> {
    @Query("select veiculo.board from Veiculo veiculo")
    List findAllBoard();

    @Query("select veiculo.board, veiculo.brand from Veiculo veiculo where veiculo.ano_fabrication = :ano_fabrication")
    List findAllVehiclesByDateFabrication(@Param("ano_fabrication") int ano_fabrication);
}
