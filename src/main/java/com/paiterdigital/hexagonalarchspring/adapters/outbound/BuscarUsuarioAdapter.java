package com.paiterdigital.hexagonalarchspring.adapters.outbound;

import com.paiterdigital.hexagonalarchspring.adapters.inbound.entity.UsuarioEntity;
import com.paiterdigital.hexagonalarchspring.adapters.inbound.mapper.UsuarioMapper;
import com.paiterdigital.hexagonalarchspring.adapters.outbound.repository.UsuarioRepository;
import com.paiterdigital.hexagonalarchspring.application.ports.out.BuscarUsuarioPort;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuscarUsuarioAdapter implements BuscarUsuarioPort {

  private final UsuarioRepository usuarioRepository;
  private final UsuarioMapper usuarioMapper;

  @Override
  public Optional<UsuarioEntity> buscarUsuarioByInstagram(String instagram) {
    return usuarioRepository.findByInstagram(instagram);
  }
}
