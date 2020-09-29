package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		int codpc1,codpc2,numpc1,numpc2;
		double vlrpc1,vlrpc2,total;
		
		
		codpc1=sc.nextInt();
		numpc1=sc.nextInt();
		vlrpc1=sc.nextDouble();
		codpc2=sc.nextInt();
		numpc2=sc.nextInt();
		vlrpc2=sc.nextDouble();
		
		total =(numpc1*vlrpc1)+(numpc2*vlrpc2);
		Locale.setDefault(Locale.US);
		System.out.printf("Valor a Pagar  = R$ %.2f%n", total);
		
		sc.close();

	}

}
