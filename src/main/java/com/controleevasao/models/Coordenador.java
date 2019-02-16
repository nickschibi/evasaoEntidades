package com.controleevasao.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@PrimaryKeyJoinColumn(name="idCoordenador")
@Table(name = "coordenador")
public class Coordenador extends Pessoa implements Serializable{

	private String senha;
	
	
	@OneToOne
	@JsonIgnore
	@JoinColumn(name = "id_curso")
	private Curso curso;
	
	

	public Coordenador() {
		super();
		
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	

}
