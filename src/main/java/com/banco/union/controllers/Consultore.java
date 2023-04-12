package com.banco.union.controllers;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.banco.union.models.dto.CaoUsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.union.models.entity.CaoAcompanhamentoSistema;
import com.banco.union.models.entity.CaoUsuario;
import com.banco.union.models.entity.CaoUsuarioPk;
import com.banco.union.models.entity.PermissaoSistema;
import com.banco.union.models.entity.PermissaoSistemaPk;
import com.banco.union.services.IConsultorService;
import com.banco.union.utils.IFormatDate;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/api/prueba-banco-union")
public class Consultore {

	@Autowired
	private IConsultorService iConsultorService;

	@Autowired
	private IFormatDate iFormatDate;
	
	private final Map<String,Object> RESPONSE = new HashMap<>();

	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getCaoAcompanhamentoSistema(@PathVariable Long id) {
		
		Optional<CaoAcompanhamentoSistema> caoAcompanhamentoSistema;

		try {
			
			caoAcompanhamentoSistema = iConsultorService.getCaoAcompanhamentoSistema(id);

			if (!caoAcompanhamentoSistema.isPresent()) {
				RESPONSE.put("message:", "result not find");
				return new ResponseEntity<Map<String,Object>>(RESPONSE, HttpStatus.NO_CONTENT);
			} 
			
		} catch (Exception e) {
			RESPONSE.put("error:", "general error");
			RESPONSE.put("exception:", e.getCause().getMessage());
			return new ResponseEntity<Map<String,Object>>(RESPONSE, HttpStatus.INTERNAL_SERVER_ERROR);			
		}
		return new ResponseEntity<CaoAcompanhamentoSistema>(caoAcompanhamentoSistema.get(), HttpStatus.OK);
	}

	@GetMapping(path = "/usuario")
	
	public ResponseEntity<?> show(@PathParam("coUsuario") String coUsuario,
			@PathParam("noUsuario") String noUsuario, @PathParam("dtAlteracao") String dtAlteracao) {

		try {
			Optional<CaoUsuario> optionalCaoUsuario = iConsultorService
					.getConsultore(new CaoUsuarioPk(coUsuario, noUsuario, iFormatDate.parseDate(dtAlteracao)));

			if (!optionalCaoUsuario.isPresent()) {
				return ResponseEntity.noContent().build();
			} else {
				return ResponseEntity.ok(optionalCaoUsuario.get());
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@GetMapping(path = "/permiss")
	
	public ResponseEntity<?> getPermissaoSistema(@PathParam("coUsuario") String coUsuario,
			@PathParam("coTipoUsuario") Integer coTipoUsuario,
			@PathParam("coSistema") Integer coSistema, @PathParam("dtAtualizacao") String dtAtualizacao) {

		try {
			
			Optional<PermissaoSistema> getPermissaoSistema = iConsultorService.getPermissaoSistema(
					new PermissaoSistemaPk(coUsuario, coTipoUsuario, coSistema, iFormatDate.parseDate(dtAtualizacao)));

			if (!getPermissaoSistema.isPresent()) {
				return ResponseEntity.noContent().build();
			} else {
				return ResponseEntity.ok(getPermissaoSistema.get());
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GetMapping(path = "/consultor/{coTipoUsuario}")
	public ResponseEntity<?> getConsultores(@PathVariable Integer[] coTipoUsuario,
			                                @PathParam("coSistema") Integer coSistema,
											@PathParam("inActivo") char inActivo){
		try {

			 List<CaoUsuarioDto> listCaoUsuarioDto = iConsultorService.getCaoUsuarioDto(coSistema, inActivo, Arrays.asList(coTipoUsuario));

			if (listCaoUsuarioDto.isEmpty()) {
				return ResponseEntity.noContent().build();
			} else {
				return ResponseEntity.ok(listCaoUsuarioDto);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
}
