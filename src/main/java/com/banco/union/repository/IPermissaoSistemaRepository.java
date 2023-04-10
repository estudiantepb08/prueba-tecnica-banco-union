package com.banco.union.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banco.union.models.entity.PermissaoSistema;
import com.banco.union.models.entity.PermissaoSistemaPk;

@Repository
public interface IPermissaoSistemaRepository extends CrudRepository<PermissaoSistema, PermissaoSistemaPk>{

}
