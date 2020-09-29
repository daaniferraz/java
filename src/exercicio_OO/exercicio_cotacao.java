package exercicio_OO;

import java.util.Scanner;

import util.calculadoraCotacao;

public class exercicio_cotacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a cotação do dolas: ");
		double  cot = sc.nextDouble();
		
		System.out.println("Quantos dolares você deseja comprar: ");
		double quant = sc.nextDouble();
		
		System.out.println("Valor em reais: "+
		String.format("%.2f", calculadoraCotacao.calculo(cot, quant)) );

	}

}
