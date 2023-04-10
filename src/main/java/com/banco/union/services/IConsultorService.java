package com.banco.union.services;

import com.banco.union.models.dto.CaoUsuarioDto;
import com.banco.union.models.entity.CaoAcompanhamentoSistema;
import com.banco.union.models.entity.CaoUsuario;
import com.banco.union.models.entity.CaoUsuarioPk;
import com.banco.union.models.entity.PermissaoSistema;
import com.banco.union.models.entity.PermissaoSistemaPk;

import java.util.List;
import java.util.Optional;

public interface IConsultorService {
	
    Optional<CaoUsuario> getConsultore(CaoUsuarioPk caoUsuarioPk);
    Optional<PermissaoSistema> getPermissaoSistema(PermissaoSistemaPk permissaoSistemaPk);
    Optional<CaoAcompanhamentoSistema> getCaoAcompanhamentoSistema(Long id);
    List<CaoUsuarioDto> getCaoUsuarioDto (Integer coSistema, char inActivo, List<Integer> coTipoUsuario);
}
