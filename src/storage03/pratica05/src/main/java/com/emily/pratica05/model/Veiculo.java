package com.emily.pratica05.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vehicle;

    private String board;

    private String brand;

    private String model;

    private int ano_fabrication;

    private int num_wheels;

    @OneToMany(mappedBy = "vehicle")
    private List<Sinistro> sinistros;
}