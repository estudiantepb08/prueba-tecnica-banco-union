package com.banco.union.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banco.union.models.entity.CaoAcompanhamentoSistema;

@Repository
public interface ICaoAcompanhamentoSistemaRepository extends CrudRepository<CaoAcompanhamentoSistema, Long>{

}
