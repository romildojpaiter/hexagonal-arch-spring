package com.paiterdigital.hexagonalarchspring.adapters.inbound.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

    @Id
    private UUID id;
    private String nome;
    private String instagram;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="endereco_id")
    private EnderecoEntity endereco;

}

