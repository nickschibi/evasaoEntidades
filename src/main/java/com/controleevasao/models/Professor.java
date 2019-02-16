package com.controleevasao.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@PrimaryKeyJoinColumn(name="idProfessor")
@Table(name = "professor")
public class Professor extends Pessoa implements Serializable{
	
	
	

	@OneToMany(mappedBy = "professor") // retirado  orphanRemoval = true
	@JsonIgnore
	private Set<Disciplina> disciplinas;
	
	
	public Professor() {
		super();
	}

	public Set<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(Set<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	

	

}
