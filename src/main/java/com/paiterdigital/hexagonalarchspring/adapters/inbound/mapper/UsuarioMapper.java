package com.paiterdigital.hexagonalarchspring.adapters.inbound.mapper;

import com.paiterdigital.hexagonalarchspring.adapters.inbound.entity.UsuarioEntity;
import com.paiterdigital.hexagonalarchspring.application.core.domain.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsuarioMapper {

    @Mapping(source = "senha", target = "password")
    UsuarioEntity toEntity(final Usuario usuario);

    @Mapping(source = "endereco.cidade", target = "endereco.localidade")
    Usuario toDomain(final UsuarioEntity usuarioEntity);

}
