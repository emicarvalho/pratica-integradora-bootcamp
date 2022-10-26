package com.emily.pratica02.service;

import com.emily.pratica02.model.Funcionario;
import com.emily.pratica02.repository.FuncionarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService implements IFuncionarioService {

    @Autowired
    private FuncionarioRepo repo;

    @Override
    public Funcionario save(Funcionario funcionario) {
        return repo.save(funcionario);
    }

    @Override
    public List<Funcionario> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Funcionario> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }

    @Override
    public Funcionario update(Funcionario funcionario) {
        return repo.save(funcionario);
    }
}
