package exercicio_vetor;

import java.util.Scanner;

import util.registroAluguel;

public class aluguel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantidades de estudantes: ");
		int n = sc.nextInt();
		
		registroAluguel vect[] = new registroAluguel[10];
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println();
			System.out.println("Hospede# " + i);
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("E-mail: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
            	
			vect[quarto] = new registroAluguel(nome, email,quarto);
			sc.nextLine();
		}
		System.out.println("Hospedes: ");
		
		for (int i = 0; i < vect.length; i++) {
			if(vect[i]!=null) {
			System.out.println(vect[i].getQuarto()+": "+vect[i].getNome()+", "+vect[i].getEmail());
			}
		}
		sc.close();
	}

}
