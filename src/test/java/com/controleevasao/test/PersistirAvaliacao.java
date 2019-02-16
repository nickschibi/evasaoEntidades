package com.controleevasao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.controleevasao.models.Avaliacao;
import com.controleevasao.models.DisciplinaAluno;
import com.controleevasao.repositories.AvaliacaoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersistirAvaliacao {
	
	
	@Autowired
	private AvaliacaoRepository ar;
	
	
	@Test
	public void test() {
		DisciplinaAluno da = new DisciplinaAluno();
		da.setIdAluno(24l);
		da.setIdDisciplina(4l);
		Avaliacao a = new Avaliacao();
		a.setP1(9.5f);
		a.setP2(4.0f);
		a.setP3(0.0f);
		a.setAno(2018);
		a.setNumFaltas(20);
		a.setNotaAvaliacao(6.7f);
		a.setSemestre(1);
		a.setDisciplinaAluno(da);
		ar.save(a);
		
	}

}
