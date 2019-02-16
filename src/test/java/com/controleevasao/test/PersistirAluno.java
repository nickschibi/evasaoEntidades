package com.controleevasao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.controleevasao.models.Aluno;
import com.controleevasao.models.Curso;
import com.controleevasao.repositories.AlunoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersistirAluno {
	
	@Autowired
	private AlunoRepository ar;
	
	@Test
	public void test() {
		Aluno a = new Aluno();
		a.setRA(14745547);
		a.setEmail("aluno@aluno.com.br");
		a.setNome("SouUmAluno");
		Curso c = new Curso();
		c.setIdCurso(1l);
		a.setCurso(c);
		ar.save(a);
	}

}
