package com.paiterdigital.hexagonalarchspring.config.security.core;

import com.paiterdigital.hexagonalarchspring.adapters.inbound.entity.UsuarioEntity;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public final class ResourceOwner implements UserDetails {

  private UsuarioEntity usuarioEntity;

  public ResourceOwner(UsuarioEntity usuarioEntity) {
    this.usuarioEntity = usuarioEntity;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return null;
  }

  @Override
  public String getPassword() {
    return this.usuarioEntity.getPassword();
  }

  @Override
  public String getUsername() {
    return this.usuarioEntity.getInstagram();
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

}
