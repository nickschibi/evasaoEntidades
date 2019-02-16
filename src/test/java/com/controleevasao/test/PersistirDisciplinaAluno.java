package com.controleevasao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.controleevasao.models.Aluno;
import com.controleevasao.models.Disciplina;
import com.controleevasao.models.DisciplinaAluno;
import com.controleevasao.repositories.DisciplinaAlunoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersistirDisciplinaAluno {
	
	@Autowired
	private DisciplinaAlunoRepository dar;
	
	@Test
	public void test(){
		
		Aluno a = new Aluno();
		a.setIdPessoa(24l);
		Disciplina d = new Disciplina();
		d.setIdDisciplina(4l);
		DisciplinaAluno da = new DisciplinaAluno();
		da.setIdAluno(a.getIdPessoa());
		da.setIdDisciplina(d.getIdDisciplina());
		dar.save(da);
	
		
		
	}

}
