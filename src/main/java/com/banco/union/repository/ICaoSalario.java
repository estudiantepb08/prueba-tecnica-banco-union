package com.banco.union.repository;

import com.banco.union.models.entity.CaoSalario;
import com.banco.union.models.entity.CaoSalarioPk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICaoSalario extends CrudRepository<CaoSalario, CaoSalarioPk> {
}
