package com.paiterdigital.hexagonalarchspring.application.ports.out;

import com.paiterdigital.hexagonalarchspring.adapters.inbound.entity.UsuarioEntity;
import java.util.Optional;

public interface BuscarUsuarioPort {
  Optional<UsuarioEntity> buscarUsuarioByInstagram(String instagram);
}
