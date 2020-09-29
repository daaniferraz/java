package util;

public class operacaoBanco {
	private int conta;
	private String nome;
	private double saldo;

	public operacaoBanco(int conta, String nome, double depositoInicial) {

		this.conta = conta;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public operacaoBanco(int conta, String nome) {

		this.conta = conta;
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valorD) {
		saldo += valorD;
	}
	
	public void saque(double valorS) {
		saldo -= valorS+5.0;
	}
	
	public String toString() {
		return "Conta: "
				+ conta
				+",Titular: "
				+nome
				+", Saldo em Conta: $"
				+String.format("%.2f",saldo);
	}

}
