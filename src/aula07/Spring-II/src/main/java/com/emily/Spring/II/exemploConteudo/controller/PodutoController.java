package com.emily.Spring.II.exemploConteudo.controller;

import com.emily.Spring.II.exemploConteudo.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class PodutoController {

    List<Produto> produtos = new ArrayList<>();

    public PodutoController(){
        produtos.add(new Produto(0,"Zero" , 10));
        produtos.add(new Produto(1, "Um", 20));
        produtos.add(new Produto(2, "Dois", 30));
    }

    @GetMapping("/{id}")
    public Produto getProduto(@PathVariable int id){
        return produtos.get(id);
    }
}
