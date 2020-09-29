package exercicio_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
	
		public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		 
		if (x < 0) 
		{
			
			System.out.printf("Numero Negativo ");
		}
		else 
		{
			System.out.printf("Numero Positivo");
		}
		
		sc.close();
		
		}
		
}
