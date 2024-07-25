package br.com.fsdney;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.fsdney.dao.IProdutoDao;
import br.com.fsdney.dao.ProdutoDao;
import br.com.fsdney.domain.Produto;

public class ProdutoTest {
	
	private IProdutoDao produtoDao;
	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}

	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setCodigo("G77");
		produto.setValor(5000d);
		produto.setNome("SMART TV");
		produtoDao.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
	}
	
}
