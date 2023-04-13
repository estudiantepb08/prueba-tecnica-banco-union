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
@Table(name = "cao_os")
public class CaoOs implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2593464382728654754L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "co_os")
    private Integer coOs;
    @Column(name = "nu_os")
    private Integer nuOs;
    @Column(name = "co_sistema")
    private Integer coSistema;
    @Column(name = "co_usuario")
    private String coUsuario;
    @Column(name = "co_arquitetura")
    private Integer coArquitetura;
    @Column(name = "ds_os")
    private String dsOs;
    @Column(name = "ds_caracteristica")
    private String dsCaracteristica;
    @Column(name = "ds_requisito")
    private String dsRequisito;
    @Column(name = "dt_inicio")
    private Date dtInicio;
    @Column(name = "dt_fim")
    private Date dtFim;
    @Column(name = "co_status")
    private Integer coStatus;
    @Column(name = "diretoria_sol")
    private String diretoriaSol;
    @Column(name = "dt_sol")
    private Date dtSol;
    @Column(name = "nu_tel_sol")
    private String nuTelSol;
    @Column(name = "ddd_tel_sol")
    private String dddTelSol;
    @Column(name = "nu_tel_sol2")
    private String nuTelSol2;
    @Column(name = "ddd_tel_sol2")
    private String dddTelSol2;
    @Column(name = "usuario_sol")
    private String usuarioSol;
    @Column(name = "dt_imp")
    private Date dtImp;
    @Column(name = "dt_garantia")
    private Date dtGarantia;
    @Column(name = "co_email")
    private Integer coEmail;
    @Column(name = "co_os_prospect_rel")
    private Integer coOsProspectRel;

}
