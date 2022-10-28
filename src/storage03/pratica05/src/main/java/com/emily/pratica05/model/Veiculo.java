package com.emily.pratica05.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Veiculo {

    @Id
    private Long id_veiculo;

    private String placa;

    private String marca;

    private String modelo;

    private Date data_fabricacao;

    private int num_wheels;
}
