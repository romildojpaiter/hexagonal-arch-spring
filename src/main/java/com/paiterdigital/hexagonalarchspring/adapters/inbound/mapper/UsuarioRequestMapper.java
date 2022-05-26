package com.paiterdigital.hexagonalarchspring.adapters.inbound.mapper;

import com.paiterdigital.hexagonalarchspring.adapters.inbound.request.UsuarioRequest;
import com.paiterdigital.hexagonalarchspring.application.core.domain.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsuarioRequestMapper {

    @Mapping(source = "cep", target = "endereco.cep")
    Usuario toDomain(UsuarioRequest usuarioRequest);

}
