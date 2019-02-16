package com.controleevasao.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import com.controleevasao.models.Pessoa;



@NoRepositoryBean
public interface PessoaBaseRepository <T extends Pessoa> extends CrudRepository<T, String>{
	 //Optional<Pessoa> findById(Long id);
}
