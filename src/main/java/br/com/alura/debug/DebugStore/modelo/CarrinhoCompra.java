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
		/*BigDecimal valorFinalDaCompra = new BigDecimal(0);
		for (Produto produto : produtosInformatica) {
			BigDecimal precoDoProduto = produto.getPreco();
			double porcentagemDesconto = carrinhoCompra.getFormaPagamento().getPorcentagemDesconto();
			BigDecimal valorDoDesconto = precoDoProduto.multiply(new BigDecimal(porcentagemDesconto)).divide(new BigDecimal("100"));
			BigDecimal precoProdutoComDesconto = precoDoProduto.subtract(valorDoDesconto);
			valorFinalDaCompra = valorFinalDaCompra.add(precoProdutoComDesconto);
		}
		return valorFinalDaCompra;*/
		BigDecimal valorFinal = BigDecimal.ZERO;
		for (Produto produto : produtos) {
			BigDecimal preco = produto.getPreco();
			double porcentagemDesconto = this.getFormaPagamento().getPorcentagemDesconto();
			BigDecimal valorComDesconto = preco.multiply(new BigDecimal(porcentagemDesconto)).divide(new BigDecimal("100"));
			valorFinal = valorFinal.add(valorComDesconto);
		}
		return valorFinal;
		
	}
	
}
