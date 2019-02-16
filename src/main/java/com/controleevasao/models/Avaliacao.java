package com.controleevasao.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Table;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "avaliacao")
public class Avaliacao {
	@Id
	@Column(name = "id_avaliacao")
	private Long idAvaliacao;
//	@Column(name = "id_disciplina_aluno")
//	private Long idDisciplinaAluno;
	private float p1;
	private float p2;
	private float p3;
	private int numFaltas;
	private float notaAvaliacao;
	private int semestre; //1 or 2
	private int ano;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "id_disciplina_aluno")
//	@JoinColumns({@JoinColumn (name = "id_disciplina", referencedColumnName = "id_disciplina"), 
//				@JoinColumn (name = "id_aluno", referencedColumnName = "id_aluno")})
	private DisciplinaAluno disciplinaAluno;
		
	
	public Avaliacao() {
		
	}

	public Avaliacao(Long idAvaliacao, float p1, float p2, float p3, int numFaltas, float notaAvaliacao) {
		super();
		this.idAvaliacao = idAvaliacao;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.numFaltas = numFaltas;
		this.notaAvaliacao = notaAvaliacao;
	}

	public Long getIdAvaliacao() {
		return idAvaliacao;
	}

	public void setIdAvaliacao(Long idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}

	public float getP1() {
		return p1;
	}

	public void setP1(float p1) {
		this.p1 = p1;
	}

	public float getP2() {
		return p2;
	}

	public void setP2(float p2) {
		this.p2 = p2;
	}

	public float getP3() {
		return p3;
	}

	public void setP3(float p3) {
		this.p3 = p3;
	}

	public int getNumFaltas() {
		return numFaltas;
	}

	public void setNumFaltas(int numFaltas) {
		this.numFaltas = numFaltas;
	}

	public float getNotaAvaliacao() {
		return notaAvaliacao;
	}

	public void setNotaAvaliacao(float notaAvaliacao) {
		this.notaAvaliacao = notaAvaliacao;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public DisciplinaAluno getDisciplinaAluno() {
		return disciplinaAluno;
	}

	public void setDisciplinaAluno(DisciplinaAluno disciplinaAluno) {
		this.disciplinaAluno = disciplinaAluno;
	}
//
//	public Long getIdDisciplinaAluno() {
//		return idDisciplinaAluno;
//	}
//
//	public void setIdDisciplinaAluno(Long idDisciplinaAluno) {
//		this.idDisciplinaAluno = idDisciplinaAluno;
//	}
//	
//	
}
