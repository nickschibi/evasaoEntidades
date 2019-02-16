package com.controleevasao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.controleevasao.models.Curso;
import com.controleevasao.models.Disciplina;
import com.controleevasao.models.Professor;
import com.controleevasao.repositories.DisciplinaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersistirDisciplina {
	
	@Autowired
	private DisciplinaRepository dr;
	
	@Test
	public void test() {
		Disciplina d = new Disciplina();
		d.setCodDisciplina("AU78458954");
		d.setNomeDisciplina("Ingles 3");
		d.setTurno("N");
		d.setCreditos(2);
		d.setCargaHoraria(180);
		Curso c = new Curso();
		Professor p = new Professor();
		p.setIdPessoa(21l);
		d.setProfessor(p);
		c.setIdCurso(1l);
		d.setCurso(c);
		dr.save(d);
	}

}
