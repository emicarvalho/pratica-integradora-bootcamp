package com.emily.aulaAoVivo.service;

import com.emily.aulaAoVivo.exception.NotFoundException;
import com.emily.aulaAoVivo.model.Veiculo;

import java.util.List;

public interface IVeiculo {
    Veiculo getVeiculo(String placa) throws NotFoundException;
    List<Veiculo> getAllVeiculo();
    List<Veiculo> getAllOrderByValue();
    void save(Veiculo veiculo);
    List<Veiculo> getByModel(String model);
}
