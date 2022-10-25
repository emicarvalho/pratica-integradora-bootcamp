package com.emily.storage02.controller;

import com.emily.storage02.interfaces.IJoia;
import com.emily.storage02.model.Joia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/joia")
public class JoiaController {

    @Autowired
    private IJoia service ;

    @PostMapping("/inserir")
    public ResponseEntity<String> insert(@RequestBody Joia joia) {
        Joia newJoia = service.insert(joia);
        return ResponseEntity.ok("Número de identificação: " + newJoia.getN_identificacao());
    }

    @GetMapping
    public ResponseEntity<List<Joia>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @DeleteMapping("/excluir")
    public ResponseEntity<Void> delete(@RequestParam("numeroDeIdentificacao") long n_identificacao) {
        service.delete(n_identificacao);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/atualizar")
    public ResponseEntity<Void> update(@RequestBody Joia joia) {
        service.update(joia);
        return ResponseEntity.noContent().build();
    }
}
