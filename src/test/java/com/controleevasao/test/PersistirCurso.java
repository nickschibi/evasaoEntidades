package com.controleevasao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.controleevasao.DataConfiguration;
import com.controleevasao.models.Coordenador;
import com.controleevasao.models.Curso;
import com.controleevasao.repositories.CursoRepository;


//@ContextConfiguration(classes = DataConfiguration.class, loader = AnnotationConfigContextLoader.class)
//@RunWith(SpringRunner.class)
////@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//@EnableJpaRepositories("com.controleevasao.repositories")
//@DataJpaTest

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersistirCurso {
	
	
	
	@Autowired
	private CursoRepository cr;

	@Test
	public void test() {
		Coordenador coo = new Coordenador();
		coo.setIdPessoa(20l);		
		Curso c = new Curso();
		c.setCodCurso("12121");
		c.setNomeCurso("ADS");
		c.setCoordenador(coo);
		cr.save(c);
		
	}

}
