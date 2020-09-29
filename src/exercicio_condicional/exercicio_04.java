package exercicio_condicional;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int tempo;
		
		tempo = a-b;
		
		
			
			if(tempo <0 ) {
				tempo =tempo*-1;
			
			System.out.println("O jogo durou :" + tempo +" Horas");
			}
			else if (tempo >0 ) {
				tempo =(tempo - 24)*-1;
			
			System.out.println("O jogo durou :" + tempo +" Horas");
			}
		else {
			if (tempo == 0) {
				tempo= 24;
				System.out.println("O jogo durou :" + tempo +" Horas");
			}
			
			
		   }
			sc.close();
		
	}

}