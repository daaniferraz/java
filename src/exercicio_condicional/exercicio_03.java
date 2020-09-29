package exercicio_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp_a;
		int temp_b;
		
		if(a > b) {
			temp_a=a;
			temp_b=b;
		}
		else {
			temp_a=b;
			temp_b=a;
		}
		
		if(temp_a %2==0  && temp_b %2==0) {
			System.out.printf("São Multiplos");
			
		}
		else {
			System.out.printf("Não são Multiplos");
		}
		
		sc.close();

	}

}
