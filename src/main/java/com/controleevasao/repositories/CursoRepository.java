package com.controleevasao.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controleevasao.models.Curso;




public interface CursoRepository extends JpaRepository<Curso, Long>{
	Optional<Curso> findById(Long id);
}
