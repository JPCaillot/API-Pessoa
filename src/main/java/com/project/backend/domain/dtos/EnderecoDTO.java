package com.project.backend.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EnderecoDTO {
    private Integer cep;
    private String rua;
    private Integer numero;
    private String cidade;
    private String estado;
}
