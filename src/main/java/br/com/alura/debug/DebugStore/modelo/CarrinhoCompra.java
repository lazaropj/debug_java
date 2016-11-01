package br.com.alura.debug.DebugStore.modelo;

import java.math.BigDecimal;
import java.util.List;

public class CarrinhoCompra {
	
	private List<Produto> produtos;
	
	private BigDecimal precoSemDesconto;
	
	private BigDecimal precoComDesconto;
	
	private String nomeCliente;
	
	private FormaPagamento formaPagamento;

	

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public BigDecimal getPrecoSemDesconto() {
		return precoSemDesconto;
	}

	public void setPrecoSemDesconto(BigDecimal precoSemDesconto) {
		this.precoSemDesconto = precoSemDesconto;
	}

	public BigDecimal getPrecoComDesconto() {
		return precoComDesconto;
	}

	public void setPrecoComDesconto(BigDecimal precoComDesconto) {
		this.precoComDesconto = precoComDesconto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
}
