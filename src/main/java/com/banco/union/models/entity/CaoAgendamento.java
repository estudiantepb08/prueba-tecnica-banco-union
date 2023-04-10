package com.banco.union.models.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="co_agendamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CaoAgendamento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3043330982429981250L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="co_agendamento")
	private Long coAgendamento;
	@Column(name="dt_hr_inicio")
	private Date dtHrInicio;
	@Column(name="dt_hr_fim")
	private Date dtHrFim;
	@Column(name="co_status_agendamento")
	private Integer coStatusAgendamento;
	@Column(name="co_diary_report_consultor")
	private Integer coDiaryReportConsultor;
	@Column(name="co_complemento")
	private Integer coComplemento;

}
