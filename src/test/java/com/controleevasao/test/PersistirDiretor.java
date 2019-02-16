package com.controleevasao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.controleevasao.repositories.DiretorRepository;
import com.controleevasao.models.Diretor;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PersistirDiretor {

	@Autowired
	private DiretorRepository dr;
	
	@Test
	public void test() {
		
		Diretor d = new Diretor();
		d.setEmail("maria@maria.com.br");
		d.setNome("Maria");
		d.setSenha("7548");	
		 dr.save(d);
		
	}

}
