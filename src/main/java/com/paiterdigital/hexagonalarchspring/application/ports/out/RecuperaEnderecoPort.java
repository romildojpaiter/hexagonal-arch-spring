package com.paiterdigital.hexagonalarchspring.application.ports.out;

import com.paiterdigital.hexagonalarchspring.application.core.domain.Endereco;
import java.util.List;

public interface RecuperaEnderecoPort {

  List<Endereco> enderecoByCep(String cep);

}
