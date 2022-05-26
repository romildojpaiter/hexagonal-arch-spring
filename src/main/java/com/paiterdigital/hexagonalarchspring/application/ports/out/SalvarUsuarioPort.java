package com.paiterdigital.hexagonalarchspring.application.ports.out;


import com.paiterdigital.hexagonalarchspring.application.core.domain.Usuario;

public interface SalvarUsuarioPort {

    Usuario salvar(final Usuario usuario);

}
