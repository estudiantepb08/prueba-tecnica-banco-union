package com.banco.union.repository;

import com.banco.union.models.entity.CaoFatura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICaoFatura extends CrudRepository<CaoFatura, Integer> {
}
