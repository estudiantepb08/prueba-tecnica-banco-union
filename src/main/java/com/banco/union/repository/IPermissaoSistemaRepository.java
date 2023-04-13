package com.banco.union.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banco.union.models.entity.CaoPermissaoSistema;
import com.banco.union.models.entity.CaoPermissaoSistemaPk;

@Repository
public interface IPermissaoSistemaRepository extends CrudRepository<CaoPermissaoSistema, CaoPermissaoSistemaPk>{

}
