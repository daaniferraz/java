package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double raio,area ;
		raio=sc.nextDouble();
		area= 3.14159 * (raio*raio);
		Locale.setDefault(Locale.US);
		System.out.printf("A = %.4f%n", area);
		sc.close();
				

	}

}
