package com.controleevasao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.controleevasao.models.Pessoa;

@Transactional
public interface PessoaRepository extends PessoaBaseRepository<Pessoa> {
	


}
