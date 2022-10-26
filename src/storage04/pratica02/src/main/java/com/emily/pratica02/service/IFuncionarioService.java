package com.emily.pratica02.service;

import com.emily.pratica02.model.Funcionario;

import java.util.List;
import java.util.Optional;

public interface IFuncionarioService {
    Funcionario save(Funcionario funcionario);
    List<Funcionario> findAll();
    Optional<Funcionario> findById(int id);
    void delete(int id);
    Funcionario update(Funcionario funcionario);
}
