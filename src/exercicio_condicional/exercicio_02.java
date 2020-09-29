package exercicio_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		
		
		if (x %2 == 0) 
		{
			
			System.out.printf("Numero Par ");
		}
		else 
		{
			System.out.printf("Numero impar");
		}
		
		sc.close();
		
		

	}

}
