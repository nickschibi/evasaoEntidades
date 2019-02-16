package com.controleevasao.models;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@IdClass(DisciplinaAlunoId.class)
@Table(name = "disciplina_aluno")
public class DisciplinaAluno {
	
	
	@Id
	@Column(name = "id_disciplina_aluno")
	private Long idDisciplinaAluno;

	
	@Column(name = "id_aluno")
	private Long idAluno;
	
	@Column(name = "id_disciplina")
	private Long idDisciplina;
	
	@OneToMany(mappedBy = "disciplinaAluno", 
		       fetch = FetchType.LAZY)
		   private Set<Avaliacao> avaliacoes;
		
	
	@ManyToOne
	@JoinColumn(name="id_disciplina",insertable = false,updatable = false)
	@JsonIgnore
	private Disciplina disciplina;
	
	@ManyToOne
	@JoinColumn(name="id_aluno",insertable = false,updatable = false)
	@JsonIgnore
	private Aluno aluno;
	
	public DisciplinaAluno() {
		
	}





	public Set<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}





	public void setAvaliacoes(Set<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}





	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public Long getIdAluno() {
		return idAluno;
	}


	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
	}


	public Long getIdDisciplina() {
		return idDisciplina;
	}


	public void setIdDisciplina(Long idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	
	
		
}
