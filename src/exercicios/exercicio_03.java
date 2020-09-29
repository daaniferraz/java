package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a,b,c,d,diferenca;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		diferenca =(a*b)-(c*d);
		Locale.setDefault(Locale.US);
		System.out.printf("Diferença  = "+ diferenca);
		sc.close();

	}

}
