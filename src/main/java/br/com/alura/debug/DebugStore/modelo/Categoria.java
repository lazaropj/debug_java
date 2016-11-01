package br.com.alura.debug.DebugStore.modelo;

public class Categoria {
	
	private String descricao;
	
	private Double porcentagemDesconto;
	
	public Categoria(String descricao) {
		this.descricao = descricao;
	}
	
	public Categoria(String descricao, Double porcentagemDesconto) {
		this.descricao = descricao;
		this.porcentagemDesconto = porcentagemDesconto;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getPorcentagemDesconto() {
		return porcentagemDesconto;
	}

}
