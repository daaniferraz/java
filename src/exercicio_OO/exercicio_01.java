package exercicio_OO;

import java.util.Scanner;

import entities.Retangulo;

public class exercicio_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo=new Retangulo();
		
		System.out.println("Enter rectangle width and height:");
		retangulo.altura=sc.nextDouble();
		retangulo.largura=sc.nextDouble();
		
		System.out.println(retangulo);
		
		
		

	}

}
