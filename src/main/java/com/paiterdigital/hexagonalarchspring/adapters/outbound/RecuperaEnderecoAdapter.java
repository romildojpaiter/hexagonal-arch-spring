package com.paiterdigital.hexagonalarchspring.adapters.outbound;

import com.paiterdigital.hexagonalarchspring.adapters.inbound.mapper.EnderecoMapper;
import com.paiterdigital.hexagonalarchspring.adapters.outbound.repository.EnderecoRepository;
import com.paiterdigital.hexagonalarchspring.application.core.domain.Endereco;
import com.paiterdigital.hexagonalarchspring.application.ports.out.RecuperaEnderecoPort;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RecuperaEnderecoAdapter implements RecuperaEnderecoPort {

  private final EnderecoRepository enderecoRepository;
  private final EnderecoMapper enderecoMapper;

  @Override
  public List<Endereco> enderecoByCep(String cep) {
    return enderecoRepository.findByCep(cep).stream().map(enderecoMapper::toDomain).toList();
  }

}
