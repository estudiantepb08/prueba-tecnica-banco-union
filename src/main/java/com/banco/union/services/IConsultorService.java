package com.banco.union.services;

import com.banco.union.models.dto.ICaoUsuarioDto;
import com.banco.union.models.entity.CaoAcompanhamentoSistema;
import com.banco.union.models.entity.CaoUsuario;
import com.banco.union.models.entity.CaoUsuarioPk;
import com.banco.union.models.entity.CaoPermissaoSistema;
import com.banco.union.models.entity.CaoPermissaoSistemaPk;
import java.util.List;
import java.util.Optional;

public interface IConsultorService {
	
    Optional<CaoUsuario> getConsultore(CaoUsuarioPk caoUsuarioPk);
    Optional<CaoPermissaoSistema> getPermissaoSistema(CaoPermissaoSistemaPk permissaoSistemaPk);
    Optional<CaoAcompanhamentoSistema> getCaoAcompanhamentoSistema(Long id);
    List<ICaoUsuarioDto> getCaoUsuarioDto (Integer coSistema, char inActivo, List<Integer> coTipoUsuario);
}
