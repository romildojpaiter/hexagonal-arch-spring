package com.paiterdigital.hexagonalarchspring.adapters.outbound;

import com.paiterdigital.hexagonalarchspring.adapters.outbound.rest.BuscarEnderecoRest;
import com.paiterdigital.hexagonalarchspring.application.core.domain.Endereco;
import com.paiterdigital.hexagonalarchspring.application.ports.out.BuscarEnderecoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuscarEnderecoAdapter implements BuscarEnderecoPort {

    private final BuscarEnderecoRest buscarEnderecoRest;

    @Override
    public Endereco buscar(final String cep) {
        return buscarEnderecoRest.buscarEndereco(cep).getBody();
    }
}
