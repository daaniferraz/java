package exercicio_OO;

import java.util.Scanner;

import entities.Funcionario;

public class exercicio_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario colaborador = new Funcionario();
		
		System.out.println("Digite o Nome: ");
		colaborador.nome = sc.nextLine();
		System.out.println("Digite o Salario: ");
		colaborador.salario = sc.nextDouble();
		System.out.println("Digite o Imposto: ");
		colaborador.imposto = sc.nextDouble();
		
		System.out.println(colaborador);
		
		System.out.println("Digite o percentual de aumento salarial: ");
		
		double ajusteSalario=sc.nextDouble();
		colaborador.ajuste(ajusteSalario);
		System.out.println("Salario Novo:"+colaborador);
		
		
	}

}
