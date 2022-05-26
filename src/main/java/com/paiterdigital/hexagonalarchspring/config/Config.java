package com.paiterdigital.hexagonalarchspring.config;

import com.paiterdigital.hexagonalarchspring.application.core.services.SalvarUsuarioService;
import com.paiterdigital.hexagonalarchspring.application.ports.out.BuscarEnderecoPort;
import com.paiterdigital.hexagonalarchspring.application.ports.out.SalvarUsuarioPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public SalvarUsuarioService salvarUsuarioService(final SalvarUsuarioPort salvarUsuarioPort, final BuscarEnderecoPort buscarEnderecoPort) {
        return new SalvarUsuarioService(salvarUsuarioPort, buscarEnderecoPort);
    }

}
