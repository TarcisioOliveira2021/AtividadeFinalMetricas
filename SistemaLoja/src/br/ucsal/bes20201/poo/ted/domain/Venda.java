package br.ucsal.bes20201.poo.ted.domain;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.bes20201.poo.ted.domain.enums.PagamentoEnum;

import javax.persistence.*;

@Entity
@Table(name = "Venda")
public class Venda {

	@Column(name = "produtos")
	@ElementCollection
	private List<Produto> produtos;

	@Column(name = "quantidades")
	@ElementCollection
	private List<Integer> quantidades;

	@Column(name = "valor_compra")
	private Double valorCompra;
	private PagamentoEnum tipoPagamento;

	public Venda() {
		this.produtos = new ArrayList<Produto>();
		this.quantidades = new ArrayList<Integer>();
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> venda) {
		this.produtos = venda;
	}

	public List<Integer> getQuantidades() {
		return quantidades;
	}

	public void setQuantidades(List<Integer> quantidades) {
		this.quantidades = quantidades;
	}

	public Double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public PagamentoEnum getTipoPagamento() {
		return tipoPagamento;
	}

	public PagamentoEnum setTipoPagamento(PagamentoEnum tipoPagamento) {
		return this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return "\n Total : " + valorCompra + ", Metodo de Pagamento : " + tipoPagamento + "]";
	}

}
