package com.banco.union.repository;

import com.banco.union.models.entity.CaoOs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICaoOs extends CrudRepository<CaoOs,Integer> {
}
