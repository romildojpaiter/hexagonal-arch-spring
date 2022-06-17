package com.paiterdigital.hexagonalarchspring.application.ports.in;

import com.paiterdigital.hexagonalarchspring.application.core.domain.Endereco;
import java.util.List;

public interface RecuperaEnderecoServicePort {

  List<Endereco> enderecosByCep(String insta);
}
