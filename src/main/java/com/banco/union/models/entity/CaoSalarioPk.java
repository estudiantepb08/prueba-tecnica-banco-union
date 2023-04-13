package com.banco.union.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CaoSalarioPk implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 9015177470752358999L;
	
	@Column(name = "co_usuario")
    private String coUsuario;
    @Column(name = "dt_alteracao")
    private Date dtAlteracao;
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coUsuario == null) ? 0 : coUsuario.hashCode());
		result = prime * result + ((dtAlteracao == null) ? 0 : dtAlteracao.hashCode());
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
		CaoSalarioPk other = (CaoSalarioPk) obj;
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
		return true;
	}
    
    

}
