package com.paiterdigital.hexagonalarchspring.config.security;

import com.paiterdigital.hexagonalarchspring.application.core.security.UserInfoService;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Classe customizada para realizar a Autenticação
 */
public class CustomAuthenticatorProvider implements AuthenticationManager {

  private UserInfoService userInfoService;
  private PasswordEncoder passwordEncoder;

  public CustomAuthenticatorProvider(UserInfoService userInfoService, PasswordEncoder passwordEncoder) {
    this.userInfoService = userInfoService;
    this.passwordEncoder = passwordEncoder;
  }


  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    var userDetails = userInfoService.loadUserByUsername(authentication.getName());

    if (Objects.nonNull(userDetails)) {
      if (passwordEncoder.matches(authentication.getCredentials().toString(), userDetails.getPassword())) {
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
//          for (Role role : user.get().getRoleSet()) {
//            grantedAuthorityList.add(new SimpleGrantedAuthority(role.getName()));
//          }
        return new UsernamePasswordAuthenticationToken(authentication.getPrincipal(), authentication.getCredentials(), grantedAuthorityList);
      } else {
        throw new BadCredentialsException("Wrong Password");
      }
    } else {
      throw new BadCredentialsException("Wrong UserName");
    }
  }
}