package br.ucsal.bes20201.poo.ted.domain;

import java.util.Map;
import java.util.TreeMap;

import javax.persistence.*;

@Entity
@Table(name = "Vendedor")
public class Vendedor extends Funcionario {

	@Id
	@Column(name = "senha", length = 11, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String senha;

	@Column(name = "vendas")
	@ElementCollection
	private Map<String, Venda> vendas;

	public Vendedor(String cpf, String nome, Double salario, Integer anoNascimento, Integer anoContratado,
			String senha) {

		super(cpf, nome, salario, anoNascimento, anoContratado);
		this.senha = senha;

	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Map<String, Venda> getVendas() {
		return vendas;
	}

	public void setVendas(TreeMap<String, Venda> vendas) {
		this.vendas = vendas;
	}

}
