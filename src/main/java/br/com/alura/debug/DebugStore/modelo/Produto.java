package br.com.alura.debug.debugStore.modelo;

import java.math.BigDecimal;

public class Produto {
	
	private String descricao;
	
	private BigDecimal preco;
	
	private Categoria categoria;
	
	public Produto(String descricao, BigDecimal preco, Categoria categoria) {
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	
}
