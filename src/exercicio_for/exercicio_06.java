package exercicio_for;

import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int temp=x;
		for (int i = 1; i <= x; i++) {
            if (temp %i==0) {
            	System.out.println(i);
            }
			

			

		}

	}

}
