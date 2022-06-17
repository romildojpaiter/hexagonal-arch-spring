package com.paiterdigital.hexagonalarchspring.application.core.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Usuario {

    private UUID id = UUID.randomUUID();
    private String nome;
    private String instagram;
    private Endereco endereco = new Endereco();
    private String senha;

}
