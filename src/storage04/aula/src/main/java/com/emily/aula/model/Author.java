package com.emily.aula.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Author {

    @Id
    private int id;
    private String name;
}
