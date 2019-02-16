package com.controleevasao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.controleevasao.models.Coordenador;
import com.controleevasao.repositories.CoordenadorRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersistirCoordenador {

	@Autowired
	private CoordenadorRepository cr;
	 
	@Test
	public void test() {
		Coordenador c = new Coordenador();
		c.setNome("Zé");
		c.setEmail("zeh@zeh.com.br");
		c.setSenha("784512");
		cr.save(c);
		
	}
	
	
}
