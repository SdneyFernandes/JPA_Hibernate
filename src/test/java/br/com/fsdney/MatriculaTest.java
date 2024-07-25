package br.com.fsdney;

import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import br.com.fsdney.dao.IMatriculaDao;
import br.com.fsdney.dao.MatriculaDao;
import br.com.fsdney.domain.Matricula;

public class MatriculaTest {
	
	private IMatriculaDao matriculaDao;
	
	public MatriculaTest() {
		matriculaDao = new MatriculaDao();
	}
	
	@Test
	public void cadastrar() {
		Matricula mat = new Matricula();
		mat.setCodigo("A2");
		mat.setDataMatricula(Instant.now());
		mat.setStatus("ATIVA");
		mat.setValor(2000d);
		matriculaDao.cadastrar(mat);
		
		assertNotNull(mat);
		assertNotNull(mat.getId());
	}

}
