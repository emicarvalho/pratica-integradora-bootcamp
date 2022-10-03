package com.emily.StringIII.service;

import com.emily.StringIII.exception.NotFoundException;
import com.emily.StringIII.model.Veiculo;
import com.emily.StringIII.repository.VeiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService implements IVeiculo{

    @Autowired
    private VeiculoRepo repo;

    @Override
    public Veiculo getVeiculo(String placa) throws NotFoundException {
        Optional<Veiculo> veiculo = Optional.ofNullable(repo.getVeiculo(placa));

        if (veiculo.isEmpty()) {
            throw new NotFoundException("Veiculo não encontrado.");
        }
        return veiculo.get();
    }

    @Override
    public List<Veiculo> getAllVeiculo() {
        return repo.getAll();
    }
}
