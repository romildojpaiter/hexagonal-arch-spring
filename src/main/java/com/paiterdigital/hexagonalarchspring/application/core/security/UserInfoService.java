package com.paiterdigital.hexagonalarchspring.application.core.security;

import com.paiterdigital.hexagonalarchspring.application.ports.out.BuscarUsuarioPort;
import com.paiterdigital.hexagonalarchspring.config.security.core.ResourceOwner;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserInfoService implements UserDetailsService {

  private final BuscarUsuarioPort buscarUsuarioPort;

  public UserInfoService(BuscarUsuarioPort buscarUsuarioPort) {
    this.buscarUsuarioPort = buscarUsuarioPort;
  }

  @Override
  public UserDetails loadUserByUsername(String instagramUser) throws UsernameNotFoundException {
    var usuario = buscarUsuarioPort.buscarUsuarioByInstagram(instagramUser);

    if (usuario.isPresent()) {
      return new ResourceOwner(usuario.get());
    }

    throw new RuntimeException("Usuario não encontrado");
  }

}
