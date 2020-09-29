package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id;
		double horas,valorHora,salario;
		id=sc.nextInt();
		horas=sc.nextDouble();
		valorHora=sc.nextDouble();
		
		salario = horas * valorHora;
		
		System.out.println("NUMERO: "+ id);
		Locale.setDefault(Locale.US);
		System.out.printf("Salario  = R$ %.2f%n", salario);
		sc.close();
	}

}
