package com.controleevasao.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="status")
public class Status {
	@Id
	private int idStatus;
	private String descStatus;
	
	public Status() {
		super();	
	}

	public Status(int idStatus, String descStatus) {
		this.idStatus = idStatus;
		this.descStatus = descStatus;
	}

	public int getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}

	public String getDescStatus() {
		return descStatus;
	}

	public void setDescStatus(String descStatus) {
		this.descStatus = descStatus;
	}
	
	

}
