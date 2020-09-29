package exercicio_for;

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
        int in = 0;
        int out =0;
        int y = sc.nextInt();;
        
        
		for (int i = 0; i <= x; i++) {
			
			if (y >= 10 && y <=20) {
				
				in = in +1;
								
			}
			else {
				out = out + 1;
			}
			
					
			if (i==x) {
				System.out.println(in +"in");
				System.out.println(out +"out");
			}
			y = sc.nextInt();

		}

		sc.close();
	}

}
