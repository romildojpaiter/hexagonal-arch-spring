package com.paiterdigital.hexagonalarchspring.adapters.inbound.mapper;

import com.paiterdigital.hexagonalarchspring.adapters.inbound.entity.EnderecoEntity;
import com.paiterdigital.hexagonalarchspring.application.core.domain.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EnderecoMapper {

    @Mapping(source = "localidade", target = "cidade")
    EnderecoEntity toEntity(Endereco endereco);

    @Mapping(source = "cidade", target = "localidade")
    Endereco toDomain(EnderecoEntity enderecoEntity);

}
