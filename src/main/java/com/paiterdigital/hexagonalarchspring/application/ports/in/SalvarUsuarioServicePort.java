package com.paiterdigital.hexagonalarchspring.application.ports.in;

import com.paiterdigital.hexagonalarchspring.application.core.domain.Usuario;

public interface SalvarUsuarioServicePort {
    Usuario salvar(final Usuario usuario, final String cep);
}
