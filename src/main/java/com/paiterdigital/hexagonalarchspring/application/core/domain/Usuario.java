package com.paiterdigital.hexagonalarchspring.application.core.domain;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Usuario {

    private UUID id = UUID.randomUUID();
    private String nome;
    private String instagram;
    private Endereco endereco = new Endereco();

}
