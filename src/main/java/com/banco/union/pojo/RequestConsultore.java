package com.banco.union.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestConsultore {
	
	private Integer coSistema;
	private char inActivo;
	private List<Integer> coTipoUsuario;

}
