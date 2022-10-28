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
    private Long id_sinister;

    private Date date_sinister;

    private Double economic_loss;

    private Long id_veiculo;
}
