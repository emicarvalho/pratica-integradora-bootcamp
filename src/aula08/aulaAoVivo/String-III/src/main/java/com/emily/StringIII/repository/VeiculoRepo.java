package com.emily.StringIII.repository;

import com.emily.StringIII.model.Veiculo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Repository
public class VeiculoRepo {
    private final String linkFile = "src/main/resources/veiculoscu.json";
    ObjectMapper mapper = new ObjectMapper();

    public Veiculo getVeiculo(String placa) {
        List<Veiculo> veiculos = null;
        try {
            veiculos = Arrays.asList(mapper.readValue(new File(linkFile), Veiculo[].class));
        } catch(Exception ex) {

        }
        for(Veiculo v: veiculos) {
            if(v.getPlaca().equals(placa)) {
                return v;
            }
        }
        return null;
    }

    public List<Veiculo> getAll() {
        List<Veiculo> veiculos = null;
        try {
            veiculos = Arrays.asList(mapper.readValue(new File(linkFile), Veiculo[].class));
        } catch(Exception ex) {

        }
        return veiculos;
    }
}