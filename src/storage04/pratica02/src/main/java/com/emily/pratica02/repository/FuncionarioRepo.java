package com.emily.pratica02.repository;

import com.emily.pratica02.model.Funcionario;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepo extends ElasticsearchRepository<Funcionario, Integer> {
    List<Funcionario> findAll();
}
