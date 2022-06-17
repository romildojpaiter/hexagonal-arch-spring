package com.paiterdigital.hexagonalarchspring.adapters.inbound;

import com.paiterdigital.hexagonalarchspring.application.core.domain.Endereco;
import com.paiterdigital.hexagonalarchspring.application.ports.in.RecuperaEnderecoServicePort;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enderecos")
@RequiredArgsConstructor
public class EnderecoController {

  private final RecuperaEnderecoServicePort recuperaEnderecoServicePort;

  @GetMapping("/cep/{cep}")
  public ResponseEntity<List<Endereco>> getByCep(final @PathVariable String cep) {
    return ResponseEntity.ok(recuperaEnderecoServicePort.enderecosByCep(cep));
  }

}
