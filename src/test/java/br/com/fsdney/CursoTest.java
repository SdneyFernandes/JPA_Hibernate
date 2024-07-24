package br.com.fsdney;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.fsdney.dao.CursoDao;
import br.com.fsdney.dao.ICursoDao;
import br.com.fsdney.domain.Curso;

public class CursoTest {

	private ICursoDao cursoDao;
	public CursoTest() {
		cursoDao = new CursoDao();
	}

	@Test
	public void cadastrar() {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("Curso Teste");
		curso.setNome("Curso de Java Backend");
		curso = cursoDao.cadastrar(curso);
		
		assertNotNull(curso);
		assertNotNull(curso.getId());
	}
}
