package com.paiterdigital.hexagonalarchspring.application.core.services;

import com.paiterdigital.hexagonalarchspring.application.core.domain.Endereco;
import com.paiterdigital.hexagonalarchspring.application.ports.in.RecuperaEnderecoServicePort;
import com.paiterdigital.hexagonalarchspring.application.ports.out.RecuperaEnderecoPort;
import java.util.List;

public class RecuperaEnderecoService implements RecuperaEnderecoServicePort {

  private RecuperaEnderecoPort recuperaEnderecoPort;

  public RecuperaEnderecoService(RecuperaEnderecoPort recuperaEnderecoPort) {
    this.recuperaEnderecoPort = recuperaEnderecoPort;
  }

  @Override
  public List<Endereco> enderecosByCep(String cep) {
    return recuperaEnderecoPort.enderecoByCep(cep);
  }

}
