package com.controleevasao.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idDiretor")
public class Diretor extends Pessoa implements Serializable{
	
	private String senha;
	

	public Diretor() {
		super();
		
	}


	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}
