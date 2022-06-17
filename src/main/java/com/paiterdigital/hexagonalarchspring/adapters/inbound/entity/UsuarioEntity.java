package com.paiterdigital.hexagonalarchspring.adapters.inbound.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.UUID;
import lombok.Data;

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

    private String password;

}

