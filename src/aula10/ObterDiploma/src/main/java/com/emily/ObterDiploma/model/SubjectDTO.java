package com.emily.ObterDiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;


@Getter @Setter
public class SubjectDTO {

    @NotBlank(message = "O nome do assunto não pode ficar vazio")
    @Pattern(regexp = "^[A-Z][a-z0-9_-]{3,19}$", message = "O nome do assunto deve começar com letra maiúscula")
    @Size(min = 1, max = 30, message =  "O comprimento do nome não pode exceder 30 caracteres")
    String name;

    @NotBlank(message = "A nota não pode estar vazia")
    @Min(value = 0, message = "A nota miníma é 0,0")
    @Max(value = 10, message = "A nota máxima é 10,0")
    Double score;
}
