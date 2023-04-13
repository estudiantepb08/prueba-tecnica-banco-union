package com.banco.union.models.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cao_sistema")
public class CaoSistema implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8615173746195502570L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "co_sistema")
    private Integer coSistema;
    @Column(name = "co_cliente")
    private Integer coCliente;
    @Column(name = "co_usuario")
    private String coUsuario;
    @Column(name = "co_arquitetura")
    private Integer coArquitetura;
    @Column(name = "no_sistema")
    private String noSistema;
    @Column(name = "ds_sistema_resumo")
    private String dsSistemaResumo;
    @Column(name = "ds_caracteristica")
    private String dsCaracteristica;
    @Column(name = "ds_requisito")
    private String dsRequisito;
    @Column(name = "no_diretoria_solic")
    private String noDiretoriaSolic;
    @Column(name = "ddd_telefone_solic")
    private String dddTelefoneSolic;
    @Column(name = "nu_telefone_solic")
    private String nuTelefoneSolic;
    @Column(name = "no_usuario_solic")
    private String noUsuarioSolic;
    @Column(name = "dt_solicitacao")
    private Date dtSolicitacao;
    @Column(name = "dt_entrega")
    private Date dtEntrega;
    @Column(name = "co_email")
    private Integer co_email;

}