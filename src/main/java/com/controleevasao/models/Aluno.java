package com.controleevasao.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@PrimaryKeyJoinColumn(name="id_aluno")
@Table(name = "aluno")
public class Aluno extends Pessoa implements Serializable {
	
	
	@Column(name="ra")
	private int RA;
	
	
		
	@ManyToOne(fetch = FetchType.LAZY, optional = true )
	@JoinColumn(name = "id_curso")
	private Curso curso;
	
	@OneToMany(mappedBy = "aluno") //retirado " orphanRemoval = true"
	@JsonIgnore
	private Set<DisciplinaAluno>disciplinaaluno;
	
	public Aluno() {
		super();
		
	}

	public int getRA() {
		return RA;
	}

	public void setRA(int rA) {
		RA = rA;
	}
	
	public Set<DisciplinaAluno> getDisciplinaAluno() {
	    return disciplinaaluno;
	}
	
	public void setDisciplinaAluno(Set<DisciplinaAluno> disciplinaaluno) {
	    this.disciplinaaluno = disciplinaaluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Set<DisciplinaAluno> getDisciplinaaluno() {
		return disciplinaaluno;
	}

	public void setDisciplinaaluno(Set<DisciplinaAluno> disciplinaaluno) {
		this.disciplinaaluno = disciplinaaluno;
	}
	
	

}
