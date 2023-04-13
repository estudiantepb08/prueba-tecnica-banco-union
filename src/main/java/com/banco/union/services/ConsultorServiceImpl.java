package com.banco.union.services;

import com.banco.union.models.dto.ICaoUsuarioDto;
import com.banco.union.models.entity.CaoAcompanhamentoSistema;
import com.banco.union.models.entity.CaoUsuario;
import com.banco.union.models.entity.CaoUsuarioPk;
import com.banco.union.models.entity.CaoPermissaoSistema;
import com.banco.union.models.entity.CaoPermissaoSistemaPk;
import com.banco.union.repository.ICaoAcompanhamentoSistemaRepository;
import com.banco.union.repository.ICaoUsuarioRepository;
import com.banco.union.repository.IPermissaoSistemaRepository;

import jakarta.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ConsultorServiceImpl implements IConsultorService {

	@Autowired
	private ICaoUsuarioRepository iCaoUsuarioRepository;

	@Autowired
	private ICaoAcompanhamentoSistemaRepository iCaoAcompanhamentoSistemaRepository;

	@Autowired
	private IPermissaoSistemaRepository iPermissaoSistemaRepository;

	private ModelMapper modelMapper;

	@Override
	@Transactional
	public Optional<CaoUsuario> getConsultore(CaoUsuarioPk caoUsuarioPk) {
		return iCaoUsuarioRepository.findById(caoUsuarioPk);
	}

	@Override
	@Transactional
	public Optional<CaoAcompanhamentoSistema> getCaoAcompanhamentoSistema(Long id) {
		// TODO Auto-generated method stub
		return iCaoAcompanhamentoSistemaRepository.findById(id);
	}

	@Override
	@Transactional
	public List<ICaoUsuarioDto> getCaoUsuarioDto(Integer coSistema, char inActivo, List<Integer> coTipoUsuarios) {

		List<ICaoUsuarioDto> listICaoUsuarioDto = new ArrayList<>();

		try {

			listICaoUsuarioDto = iCaoUsuarioRepository.findByNoUsuario(coSistema, inActivo, coTipoUsuarios);
		} catch (Exception ex) {
			ex.printStackTrace();

		}

		return listICaoUsuarioDto;
	}

	@Override
	public Optional<CaoPermissaoSistema> getPermissaoSistema(CaoPermissaoSistemaPk permissaoSistemaPk) {
		// TODO Auto-generated method stub
		return iPermissaoSistemaRepository.findById(permissaoSistemaPk);
	}
}
