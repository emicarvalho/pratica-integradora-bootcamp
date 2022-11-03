package com.emily.pratica05.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Sinistro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sinister;

    private Date date_sinister;

    private Double economic_loss;

    @ManyToOne
    @JoinColumn(name = "id_vehicle")
    private Veiculo vehicle;
}
