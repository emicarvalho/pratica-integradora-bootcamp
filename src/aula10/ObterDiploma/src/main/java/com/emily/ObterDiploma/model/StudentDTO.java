package com.emily.ObterDiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter @Setter
public class StudentDTO {

    @NotBlank(message = "O nome do aluno não pode ficar vazio")
    @Pattern(regexp = "^[A-Z][a-z0-9_-]{3,19}$", message = "O nome do aluno deve começar com letra maiúscula")
    @Size(min = 1, max = 50, message = "O comprimento do nome não pode exceder 50 caracteres")
    String studentName;

    String message;
    Double averageScore;

    @NotEmpty(message = "A lista não pode estar vazia")
    List<SubjectDTO> subjects;
}
