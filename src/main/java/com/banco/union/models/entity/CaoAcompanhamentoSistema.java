package com.banco.union.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cao_acompanhamento_sistema")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CaoAcompanhamentoSistema implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4824457181868767716L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="co_acompanhamento")
	private Long coAcompanhamento;
	@Column(name="email")
	private String email;
	@Column(name="senha")
	private String senha;
	@Column(name="co_sistema")
	private Integer coSistema;
	@Column(name="status")
	private char status;

}
