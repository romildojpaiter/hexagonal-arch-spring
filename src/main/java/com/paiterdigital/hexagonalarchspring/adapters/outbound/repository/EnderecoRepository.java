package com.paiterdigital.hexagonalarchspring.adapters.outbound.repository;

import com.paiterdigital.hexagonalarchspring.adapters.inbound.entity.EnderecoEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Long> {

  public List<EnderecoEntity> findByCep(String cep);

}
