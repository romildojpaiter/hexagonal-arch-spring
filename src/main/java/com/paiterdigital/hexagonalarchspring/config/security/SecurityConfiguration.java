package com.paiterdigital.hexagonalarchspring.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

  @Bean
  public PasswordEncoder encoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  public SecurityFilterChain configureHttpSecurity(HttpSecurity http, AuthenticationManager authenticationManager) throws Exception {
    http.csrf().disable()
        .authorizeRequests((authz) -> authz.anyRequest().authenticated())
        .httpBasic(Customizer.withDefaults())
        .authenticationManager(authenticationManager);
    return http.build();
  }

  @Bean
  public WebSecurityCustomizer configureAllowerdUrlsWebSecurityCustomers() {
    return web -> web.ignoring().antMatchers("/usuarios", "/ignore2");
  }

//  @Bean
//  public AuthenticationManager configureAuthentication(AuthenticationManagerBuilder auth, UserInfoService userInfoService) throws Exception {
//    return auth.userDetailsService(userInfoService)
//        .passwordEncoder(this.encoder())
//        .and().build();
//  }




}
