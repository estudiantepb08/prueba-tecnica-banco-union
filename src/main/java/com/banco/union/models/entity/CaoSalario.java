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
@Table(name = "cao_salario")
public class CaoSalario implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6357539167814100538L;
	@EmbeddedId
    private CaoSalarioPk caoSalarioPk;
    @Column(name = "brut_salario")
    private Float brutSalario;
    @Column(name = "liq_salario")
    private Float liqSalario;
}
