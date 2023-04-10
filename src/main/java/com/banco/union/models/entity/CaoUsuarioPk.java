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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CaoUsuarioPk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4129296912488485422L;
	
	@Column(name="co_usuario")
	private String coUsuario;
	@Column(name="no_usuario")
	private String noUsuario;
	@Column(name="dt_alteracao")
	private Date dtAlteracao;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coUsuario == null) ? 0 : coUsuario.hashCode());
		result = prime * result + ((dtAlteracao == null) ? 0 : dtAlteracao.hashCode());
		result = prime * result + ((noUsuario == null) ? 0 : noUsuario.hashCode());
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
		CaoUsuarioPk other = (CaoUsuarioPk) obj;
		if (coUsuario == null) {
			if (other.coUsuario != null)
				return false;
		} else if (!coUsuario.equals(other.coUsuario))
			return false;
		if (dtAlteracao == null) {
			if (other.dtAlteracao != null)
				return false;
		} else if (!dtAlteracao.equals(other.dtAlteracao))
			return false;
		if (noUsuario == null) {
			if (other.noUsuario != null)
				return false;
		} else if (!noUsuario.equals(other.noUsuario))
			return false;
		return true;
	}
	
	
}
