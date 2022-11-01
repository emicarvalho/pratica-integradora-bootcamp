package com.emily.pratica05.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private long id_vehicle;

    private String board;

    private String brand;

    private String model;

    private Date date_fabrication;

    private int num_wheels;

    @OneToMany(mappedBy = "vehicle")
    private List<Sinistro> sinistros;
}