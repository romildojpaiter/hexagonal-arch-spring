package com.paiterdigital.hexagonalarchspring.adapters.inbound;

import com.paiterdigital.hexagonalarchspring.adapters.inbound.mapper.UsuarioRequestMapper;
import com.paiterdigital.hexagonalarchspring.adapters.inbound.request.UsuarioRequest;
import com.paiterdigital.hexagonalarchspring.application.core.domain.Usuario;
import com.paiterdigital.hexagonalarchspring.application.ports.in.SalvarUsuarioServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final SalvarUsuarioServicePort salvarUsuarioServicePort;
    private final UsuarioRequestMapper usuarioRequestMapper;

    @PostMapping
    public ResponseEntity<Usuario> salvarUsuario(@RequestBody final UsuarioRequest usuarioRequest){
        var usuario = usuarioRequestMapper.toDomain(usuarioRequest);
        return ResponseEntity.ok(salvarUsuarioServicePort.salvar(usuario, usuarioRequest.getCep()));
    }

}
