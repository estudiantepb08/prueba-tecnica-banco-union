package com.banco.union.models.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cao_cliente")
public class CaoCliente implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7942509931102681076L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "co_cliente")
    private Integer coCliente;
    @Column(name = "no_razao")
    private String noRazao;
    @Column(name = "no_fantasia")
    private String noFantasia;
    @Column(name = "no_contato")
    private String nuTelefone;
    @Column(name = "nu_ramal")
    private String nuRamal;
    @Column(name = "nu_cnpj")
    private String nuCnpj;
    @Column(name = "ds_endereco")
    private String dsEndereco;
    @Column(name = "nu_numero")
    private Integer nuNumero;
    @Column(name = "ds_complemento")
    private String dsComplemento;
    @Column(name = "no_bairro")
    private String noBairro;
    @Column(name = "nu_cep")
    private String nuCep;
    @Column(name = "no_pais")
    private String noPais;
    @Column(name = "co_ramo")
    private Integer coRamo;
    @Column(name = "co_cidade")
    private Integer coCidade;
    @Column(name = "co_status")
    private Integer coStatus;
    @Column(name = "ds_site")
    private String dsSite;
    @Column(name = "ds_email")
    private String dsEmail;
    @Column(name = "ds_cargo_contato")
    private String dsCargoContato;
    @Column(name = "tp_cliente")
    private Character tpCliente;
    @Column(name = "ds_referencia")
    private String dsReferencia;
    @Column(name = "co_complemento_status")
    private Integer coComplementoStatus;
    @Column(name = "nu_fax")
    private String nuFax;
    @Column(name = "ddd2")
    private String ddd2;
    @Column(name = "telefone2")
    private String telefone2;
}
