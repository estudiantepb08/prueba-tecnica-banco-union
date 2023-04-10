package com.banco.union.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PermissaoSistemaPk implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4553601899255921532L;
	
	@Column(name="co_usuario")
	private String coUsuario;
	@Column(name="co_tipo_usuario")
	private Integer coTipoUsuario;
	@Column(name="co_sistema")
	private Integer coSistema;
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coSistema == null) ? 0 : coSistema.hashCode());
		result = prime * result + ((coTipoUsuario == null) ? 0 : coTipoUsuario.hashCode());
		result = prime * result + ((coUsuario == null) ? 0 : coUsuario.hashCode());
		result = prime * result + ((dtAtualizacao == null) ? 0 : dtAtualizacao.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PermissaoSistemaPk other = (PermissaoSistemaPk) obj;
		if (coSistema == null) {
			if (other.coSistema != null)
				return false;
		} else if (!coSistema.equals(other.coSistema))
			return false;
		if (coTipoUsuario == null) {
			if (other.coTipoUsuario != null)
				return false;
		} else if (!coTipoUsuario.equals(other.coTipoUsuario))
			return false;
		if (coUsuario == null) {
			if (other.coUsuario != null)
				return false;
		} else if (!coUsuario.equals(other.coUsuario))
			return false;
		if (dtAtualizacao == null) {
			if (other.dtAtualizacao != null)
				return false;
		} else if (!dtAtualizacao.equals(other.dtAtualizacao))
			return false;
		return true;
	}
			
}
