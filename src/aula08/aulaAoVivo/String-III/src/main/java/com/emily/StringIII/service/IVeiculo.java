package com.emily.StringIII.service;

import com.emily.StringIII.model.Veiculo;

import java.util.List;

public interface IVeiculo {
    Veiculo getVeiculo(String placa);
    List<Veiculo> getAllVeiculo();
}
