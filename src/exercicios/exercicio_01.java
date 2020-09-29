package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int a,b,soma;
		a=sc.nextInt();
		b=sc.nextInt();
		soma=a+b;
		Locale.setDefault(Locale.US);
		System.out.printf("Soma = "+ soma);
		sc.close();
				
		
	}

}
