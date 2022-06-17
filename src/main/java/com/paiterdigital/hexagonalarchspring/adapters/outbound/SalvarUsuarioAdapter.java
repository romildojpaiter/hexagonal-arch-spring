package com.paiterdigital.hexagonalarchspring.adapters.outbound;

import javax.transaction.Transactional;
import com.paiterdigital.hexagonalarchspring.adapters.inbound.entity.UsuarioEntity;
import com.paiterdigital.hexagonalarchspring.adapters.inbound.mapper.EnderecoMapper;
import com.paiterdigital.hexagonalarchspring.adapters.inbound.mapper.UsuarioMapper;
import com.paiterdigital.hexagonalarchspring.adapters.outbound.repository.UsuarioRepository;
import com.paiterdigital.hexagonalarchspring.application.core.domain.Usuario;
import com.paiterdigital.hexagonalarchspring.application.ports.out.SalvarUsuarioPort;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SalvarUsuarioAdapter implements SalvarUsuarioPort {

    private final UsuarioRepository usuarioRepository;
    private final EnderecoMapper enderecoMapper;
    private final UsuarioMapper usuarioMapper;
    private final PasswordEncoder passwordEncoder;


    @Override
    @Transactional
    public Usuario salvar(final Usuario usuario) {
        var usuarioEntity = usuarioMapper.toEntity(usuario);
        var enderecoEntity = enderecoMapper.toEntity(usuario.getEndereco());
        criptografarSenhaUsuario(usuarioEntity);
        usuarioEntity.setEndereco(enderecoEntity);
        usuarioRepository.save(usuarioEntity);
        return usuarioMapper.toDomain(usuarioEntity);
    }

    private void criptografarSenhaUsuario(UsuarioEntity usuarioEntity) {
        var senhaSemCripto = usuarioEntity.getPassword();
        usuarioEntity.setPassword(passwordEncoder.encode(senhaSemCripto));
    }
}
