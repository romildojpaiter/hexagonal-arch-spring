package com.paiterdigital.hexagonalarchspring.application.ports.out;


import com.paiterdigital.hexagonalarchspring.application.core.domain.Endereco;

public interface BuscarEnderecoPort {

    Endereco buscar(final String cep);
}
