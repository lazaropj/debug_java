package br.com.alura.debug.debugStore.modelo;

import java.math.BigDecimal;
import java.util.List;

public class CarrinhoCompra {
	
	private List<Produto> produtos;
	
	private BigDecimal precoSemDesconto;
	
	private BigDecimal precoComDesconto;
	
	private String nomeCliente;
	
	private FormaPagamento formaPagamento;
	
	public CarrinhoCompra(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	
	public BigDecimal calcularPrecoFinal(List<Produto> produtos) {
		BigDecimal valorFinal = BigDecimal.ZERO;
		for (Produto produto : produtos) {
			BigDecimal preco = produto.getPreco();
			double porcentagemDesconto = this.getFormaPagamento().getPorcentagemDesconto();
			BigDecimal valorDoDesconto = preco.multiply(new BigDecimal(porcentagemDesconto)).divide(new BigDecimal("100.00"));
			BigDecimal precoProdutoComDesconto = preco.subtract(valorDoDesconto);
			//Aula 2
			if (precoProdutoComDesconto.compareTo(new BigDecimal("700.00")) == 1 ){
				System.out.println("O produto " + produto.getDescricao() + " ganhou mais R$20,00 de desconto");
				precoProdutoComDesconto = precoProdutoComDesconto.subtract(new BigDecimal("20.00"));
			}
			valorFinal = valorFinal.add(precoProdutoComDesconto);
		}
		return valorFinal;
		
	}
	
}
