package com.controleevasao.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "disciplina")
public class Disciplina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDisciplina;
	private String codDisciplina;
	private String nomeDisciplina;
	private String turno; // M, V, N
	private int creditos;
	private int cargaHoraria;
	
	
	@ManyToOne(
		       fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "id_professor")
	private Professor professor;
		
	
	@ManyToOne( 
		       fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "id_curso")
	private Curso curso;
	
	@OneToMany(mappedBy = "disciplina") // retirado  orphanRemoval = true
	@JsonIgnore
	private Set<DisciplinaAluno>disciplinaaluno;
	
	public Disciplina() {
		
	}


	public Disciplina(String codDisciplina, String nomeDisciplina, String turno, int creditos, int cargaHoraria) {
		super();
		this.codDisciplina = codDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.turno = turno;
		this.creditos = creditos;
		this.cargaHoraria = cargaHoraria;
	}



	public Long getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(Long idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	
	public String getCodDisciplina() {
		return codDisciplina;
	}

	public void setCodDisciplina(String codDisciplina) {
		this.codDisciplina = codDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
    

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Set<DisciplinaAluno> getDisciplinaAluno() {
	    return disciplinaaluno;
	}
	
	public void setDisciplinaAluno(Set<DisciplinaAluno> disciplinaaluno) {
	    this.disciplinaaluno = disciplinaaluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
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
