package com.banco.union.repository;

import com.banco.union.models.entity.CaoCliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICaoCliente extends CrudRepository<CaoCliente, Integer> {
}
