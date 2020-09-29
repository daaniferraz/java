package exercicio_for;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		double media=0;
		for (int i =0;i<=num-1;i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			 media = a/b;
			
			if( b==0) {
				System.out.println("Divisão Impossivel");
			}
			  else {
			   System.out.println(media);
			 }
		}
		

	}

}
