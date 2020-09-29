package exercicio_for;

import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int temp=1;
		for (int i =0 ;i<x;i++) {
			
			temp *= x-i;
			
		}
		System.out.println(temp);

	}

}
