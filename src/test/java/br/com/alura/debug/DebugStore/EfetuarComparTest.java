package br.com.alura.debug.DebugStore;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import br.com.alura.debug.DebugStore.modelo.Categoria;
import br.com.alura.debug.DebugStore.modelo.Produto;

public class EfetuarComparTest {
	
	@Before
	public void configurarCompra(){
		Categoria categoria = new Categoria("PERFUMARIA");
		Produto produto = new Produto();
		produto.setCategoria(categoria);
		produto.setDescricao("212 Blue");
		produto.setPreco(new BigDecimal("30.00"));
		
	}
	
	@Test
	public void comprarPerfume(){
		
	}

}
