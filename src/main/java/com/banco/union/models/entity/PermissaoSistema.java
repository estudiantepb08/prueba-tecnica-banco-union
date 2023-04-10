package com.banco.union.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="permissao_sistema")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PermissaoSistema implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4580337239420730271L;
	
	@EmbeddedId
	private PermissaoSistemaPk permissaoSistemaPk;
	@Column(name="in_ativo")
	private char inActivo;
	@Column(name="co_usuario_atualizacao")
	private String coUsuarioAtualizacao;
	
}
