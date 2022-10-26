package com.emily.pratica02.controller;


import com.emily.pratica02.model.Funcionario;
import com.emily.pratica02.service.IFuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private IFuncionarioService service;

    @PostMapping
    public ResponseEntity<Funcionario> inserir(@RequestBody Funcionario funcionario) {
        Funcionario newFuncionario = service.save(funcionario);
        return new ResponseEntity<>(newFuncionario, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Funcionario>> findAll() {
        List<Funcionario> funcionarios = service.findAll();
        return new ResponseEntity<>(funcionarios, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable int id) {
        Optional<Funcionario> funcionario = service.findById(id);

        if(funcionario.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(funcionario.get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>("Funcionário removido", HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Funcionario> update(@RequestBody Funcionario funcionario) {
        Funcionario funcionarioUpdated = service.update(funcionario);
        return new ResponseEntity<>(funcionarioUpdated, HttpStatus.OK);
    }
}
