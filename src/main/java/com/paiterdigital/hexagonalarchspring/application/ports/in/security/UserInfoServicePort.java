package com.paiterdigital.hexagonalarchspring.application.ports.in.security;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserInfoServicePort {

  UserDetails loadUserByInstagram(final String instagram);

}
