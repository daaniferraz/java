package exercicio_while;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tipo = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;

		

		
		while (tipo != 4) {
			
			if (tipo != 1 && tipo != 2 && tipo != 3 && tipo != 4) {
				System.out.println("Digite novamente");
				tipo = sc.nextInt();
			}
			
			if (tipo == 1) {
				alcool = alcool +1;
			}
			   if (tipo == 2) {
				 gasolina = gasolina +1;
			} 
			   if (tipo == 3) {
					disel = disel +1;
				}
			   tipo = sc.nextInt();

			
		if(tipo == 4) {
		  System.out.println("Muito Obrigado");
		  System.out.println("Alcool: "+ alcool);
		  System.out.println("Gasolina: "+ gasolina);
		  System.out.println("Disel: "+disel);
		}
	}
		sc.close();
 }

}
