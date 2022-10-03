package com.emily.aulaAoVivo.service;

import com.emily.aulaAoVivo.exception.NotFoundException;
import com.emily.aulaAoVivo.model.Veiculo;
import com.emily.aulaAoVivo.repository.VeiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VeiculoService implements IVeiculo {

    @Autowired
    private VeiculoRepo repo;

    @Override
    public Veiculo getVeiculo(String placa) throws NotFoundException {
        Optional<Veiculo> veiculo = repo.getVeiculo(placa);

        if(veiculo.isEmpty()) {
            throw new NotFoundException("Veiculo não encontrado.");
        }
        return veiculo.get();
    }

    @Override
    public List<Veiculo> getAllVeiculo() {
        return repo.getAll();
    }

    @Override
    public List<Veiculo> getAllOrderByValue() {
        List<Veiculo> veiculos = repo.getAll();

        return veiculos.stream().sorted().collect(Collectors.toList());
    }

    @Override
    public void save(Veiculo veiculo) {
        repo.saveVeiculo(veiculo);
    }

    @Override
    public List<Veiculo> getByModel(String model) {
        return getAllVeiculo().stream()
                .filter(v-> v.getModelo().equalsIgnoreCase(model))
                .collect(Collectors.toList());
    }

}
