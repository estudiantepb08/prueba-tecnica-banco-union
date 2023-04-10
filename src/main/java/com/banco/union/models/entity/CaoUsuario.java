package com.banco.union.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cao_usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CaoUsuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6710303898251543209L;
	
	@EmbeddedId
	private CaoUsuarioPk caoUsuarioPk;
	@Column(name="ds_senha")
	private String dsSenha;
	@Column(name="co_usuario_autorizacao")
	private String coUsuarioAutorizacao;
	@Column(name="nu_matricula")
	private Integer nuMatricula;
	@Column(name="dt_nascimento")
	private Date dtNascimento;
	@Column(name="dt_admissao_empresa")
	private Date dtAdmissaoEmpresa;
	@Column(name="dt_desligamento")
	private Date dtDesligamento;
	@Column(name="dt_inclusao")
	private Date dtInclusao;
	@Column(name="dt_expiracao")
	private Date dtExpiracao;
	@Column(name="nu_cpf")
	private String nuCpf;
	@Column(name="nu_rg")
	private String nuRg;
	@Column(name="no_orgao_emissor")
	private String noOrgaoEmissor;
	@Column(name="uf_orgao_emissor")
	private String ufOrgaoEmissor;
	@Column(name="ds_endereco")
	private String dsEndereco;
	@Column(name="no_email", unique = true)
	private String noEmail;
	@Column(name="no_email_pessoal", unique = true)
	private String noEmailPessoal;
	@Column(name="nu_telefone")
	private String nuTelefone;	
	@Column(name="url_foto")
	private String urlFoto;
	@Column(name="instant_messenger")
	private String instantMessenger;
	@Column(name="icq")
	private Integer icq;
	@Column(name="msn")
	private String msn;
	@Column(name="yms")
	private String yms;
	@Column(name="ds_comp_end")
	private String dsCompEnd;
	@Column(name="ds_bairro")
	private String dsBairro;
	@Column(name="nu_cep")
	private String nuCep;
	@Column(name="no_cidade")
	private String noCidade;
	@Column(name="uf_cidade")
	private String ufCidade;
	@Column(name="dt_expedicao")
	private Date dtExpedicao;	
	
}
