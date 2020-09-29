package exercicio_OO;

import java.util.Scanner;

import util.operacaoBanco;

public class exercicio_banco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		operacaoBanco dados;

		System.out.println("Digite o Numero da Conta: ");
		int conta = sc.nextInt();
		System.out.println("Digite o Nome do Titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Deseja fazer um deposito Inicial (S/N) ?");
		char depini = sc.next().charAt(0);
		if (depini == 's') {
			System.out.println("Valor para deposito Inicial: ");
			double depositoInicial = sc.nextDouble();
			dados = new operacaoBanco(conta, nome, depositoInicial);
		} else {
			dados = new operacaoBanco(conta, nome);
		}

		System.out.println(dados);
		System.out.println();

		System.out.println("Valor de deposito");
		double valorDep = sc.nextDouble();
		dados.deposito(valorDep);

		System.out.println("Dados da Sonta" + dados);
		System.out.println();
		
		System.out.println("Valor de Saque");
		double valorSaq = sc.nextDouble();
		dados.saque(valorSaq);
		
		System.out.println("Dados da Sonta" + dados);

		sc.close();

	}

}
