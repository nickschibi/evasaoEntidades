package com.controleevasao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.controleevasao.models.Professor;
import com.controleevasao.repositories.ProfessorRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PersistirProfessor {
	
	@Autowired
	private ProfessorRepository pr;
	
	@Test
	public void test(){
		Professor p = new Professor();
		p.setNome("Jandira");
		p.setRg("4887222122");
		p.setEmail("jandira@jandira.com.br");
		pr.save(p);
		
		
	}
	
	
}
