package exercicio_condicional;

import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		int quantidade = sc.nextInt();
		
	double total = 0;
	
	if (id==1) {
		total = quantidade * 4.00;
	}
	if (id==2) {
		total = quantidade * 4.50;
	}
	if (id==3) {
		total = quantidade * 5.00;
	}
	if (id==4) {
		total = quantidade * 2.00;
	}
	if (id==5) {
		total = quantidade * 1.50;
	}
	System.out.println("Total : R$ "+ total);
	
	sc.close();

 }
}

