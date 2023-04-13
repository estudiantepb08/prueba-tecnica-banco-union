package com.banco.union.models.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "cao_fatura")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CaoFatura implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -2553595928076639669L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "co_fatura")
    private Integer coFatura;
    @Column(name = "co_cliente")
    private Integer coCliente;
    @Column(name = "co_sistema")
    private Integer coSistema;
    @Column(name = "co_os")
    private Integer coOs;
    @Column(name = "num_nf")
    private Integer numNf;
    @Column(name = "total")
    private Float total;
    @Column(name = "valor")
    private Float valor;
    @Column(name = "data_emissao")
    private Date dataEmissao;
    @Column(name = "corpo_nf")
    private String corpoNf;
    @Column(name = "comissao_cn")
    private Float comissaoCn;
    @Column(name = "total_imp_inc")
    private Float totalImpInc;

}
