package com.controleevasao.models;

import java.io.Serializable;


public class DisciplinaAlunoId implements Serializable {
	
	private Long idAluno;
	private Long idDisciplina;
	
	public DisciplinaAlunoId() {
		super();
	}

	
	public DisciplinaAlunoId(Long idAluno, Long idDisciplina) {
		super();
		this.idAluno = idAluno;
		this.idDisciplina = idDisciplina;
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

	
	private static final long serialVersionUID = -2834827403836993112L;

	 @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((idDisciplina == null) ? 0 : idDisciplina.hashCode());
	        result = prime * result + ((idAluno == null) ? 0 : idAluno.hashCode());
	        return result;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        DisciplinaAlunoId other = (DisciplinaAlunoId) obj;
	        if (idDisciplina == null) {
	            if (other.idDisciplina != null)
	                return false;
	        } else if (!idDisciplina.equals(other.idDisciplina))
	            return false;
	        if (idAluno == null) {
	            if (other.idAluno != null)
	                return false;
	        } else if (!idAluno.equals(other.idAluno))
	            return false;
	        return true;
	    }
	
}
