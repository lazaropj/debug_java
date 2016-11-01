package br.com.alura.debug.DebugStore;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.debug.DebugStore.modelo.CarrinhoCompra;
import br.com.alura.debug.DebugStore.modelo.Categoria;
import br.com.alura.debug.DebugStore.modelo.FormaPagamento;
import br.com.alura.debug.DebugStore.modelo.Produto;

public class App {
	
	public static void main(String[] args) {
		Categoria categoria = criarCategoria();
		List<Produto> produtosInformatica = criarProdutos(categoria);
		CarrinhoCompra carrinhoCompra = new CarrinhoCompra();
		carrinhoCompra.setFormaPagamento(FormaPagamento.BOLETO);
		BigDecimal valorFinalDaCompra = calcularPrecoFinal(carrinhoCompra, produtosInformatica);
		System.out.println(valorFinalDaCompra);
	}

	private static BigDecimal calcularPrecoFinal(CarrinhoCompra carrinhoCompra, List<Produto> produtosInformatica) {
		BigDecimal valorFinalDaCompra = new BigDecimal(0);
		for (Produto produto : produtosInformatica) {
			BigDecimal preco = produto.getPreco();
			double porcentagemDesconto = carrinhoCompra.getFormaPagamento().getPorcentagemDesconto();
			BigDecimal valorComDesconto = preco.multiply(new BigDecimal(porcentagemDesconto)).divide(new BigDecimal("100"));
			valorFinalDaCompra = valorFinalDaCompra.add(valorComDesconto);
		}
		return valorFinalDaCompra;
		
	}

	private static Categoria criarCategoria() {
		return new Categoria("INFORMÁTICA");
	}
	
	private static List<Produto> criarProdutos(Categoria categoria) {
		List<Produto> produtos = new ArrayList<Produto>();
		Produto mouse = new Produto();
		mouse.setCategoria(categoria);
		mouse.setDescricao("Mouse sem fio Microsoft");
		mouse.setPreco(new BigDecimal(("120.00")));
		produtos.add(mouse);
		Produto teclado = new Produto();
		teclado.setCategoria(categoria);
		teclado.setDescricao("Teclado de Gamer Alien");
		teclado.setPreco(new BigDecimal("350.00"));
		produtos.add(teclado);
		return produtos;
	}
}
