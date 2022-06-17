package com.paiterdigital.hexagonalarchspring.config;

import com.paiterdigital.hexagonalarchspring.application.core.services.RecuperaEnderecoService;
import com.paiterdigital.hexagonalarchspring.application.core.services.SalvarUsuarioService;
import com.paiterdigital.hexagonalarchspring.application.core.security.UserInfoService;
import com.paiterdigital.hexagonalarchspring.application.ports.out.BuscarEnderecoPort;
import com.paiterdigital.hexagonalarchspring.application.ports.out.BuscarUsuarioPort;
import com.paiterdigital.hexagonalarchspring.application.ports.out.RecuperaEnderecoPort;
import com.paiterdigital.hexagonalarchspring.application.ports.out.SalvarUsuarioPort;
import com.paiterdigital.hexagonalarchspring.config.security.CustomAuthenticatorProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Config {

    @Bean
    public SalvarUsuarioService salvarUsuarioService(final SalvarUsuarioPort salvarUsuarioPort, final BuscarEnderecoPort buscarEnderecoPort) {
        return new SalvarUsuarioService(salvarUsuarioPort, buscarEnderecoPort);
    }

    @Bean
    public RecuperaEnderecoService recuperaEnderecoService(final RecuperaEnderecoPort recuperaEnderecoPort) {
        return new RecuperaEnderecoService(recuperaEnderecoPort);
    }

    @Bean
    public UserInfoService userInfoService(final BuscarUsuarioPort buscarUsuarioPort) {
        return new UserInfoService(buscarUsuarioPort);
    }

    @Bean
    public AuthenticationManager authenticationManager(final UserInfoService userInfoService, final PasswordEncoder passwordEncoder) {
        return new CustomAuthenticatorProvider(userInfoService, passwordEncoder);
    }
}
