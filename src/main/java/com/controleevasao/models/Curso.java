package com.controleevasao.models;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "curso")
public class Curso {
	@Id
	private Long idCurso;	
	private String codCurso; //código existente em outros sistemas
	private String nomeCurso;
	
	
	@OneToOne
	@JsonIgnore
	@JoinColumn(name = "id_coordenador")
	private Coordenador coordenador;
	
	
	@OneToMany(mappedBy = "curso", cascade = CascadeType.ALL) // retirado  orphanRemoval = true
	@JsonIgnore
	private Set<Aluno>alunos;
	
	@OneToMany(mappedBy = "curso", cascade = CascadeType.ALL) // retirado  orphanRemoval = true
	@JsonIgnore
	private Set<Disciplina>disciplina;
	
	
	public Curso( String codCurso, String nomeCurso) {
		this.codCurso = codCurso;
		this.nomeCurso = nomeCurso;
		
	}

	public Curso() {
		super();
	}

	
	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}

	public String getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}


	public Set<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Set<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Set<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}

	public Coordenador getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}
		
}
