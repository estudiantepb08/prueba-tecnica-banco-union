package com.banco.union.repository;

import com.banco.union.models.entity.CaoSistema;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICaoSistema extends CrudRepository<CaoSistema, Integer> {
}
