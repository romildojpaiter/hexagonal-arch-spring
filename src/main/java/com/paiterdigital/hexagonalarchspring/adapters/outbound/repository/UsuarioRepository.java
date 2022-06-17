package com.paiterdigital.hexagonalarchspring.adapters.outbound.repository;

import com.paiterdigital.hexagonalarchspring.adapters.inbound.entity.UsuarioEntity;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, UUID> {

  Optional<UsuarioEntity> findByInstagram(final String instagram);

}
