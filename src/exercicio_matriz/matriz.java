package exercicio_matriz;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Nuemro de linhas");
		int n = sc.nextInt();
		System.out.println("Nuemro de Colunas");
		int m = sc.nextInt();
		
		int [][]mat = new int [n][m];
		
		for(int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				mat[i][j]= sc.nextInt();
		 }
	  }
		System.out.println("Buscar numero: ");
		
		int num= sc.nextInt();
		for (int i =0;i<n;i++) {
			for (int j=0;j<m;j++) {
				if (mat[i][j] == num){
					
					System.out.println("Posi��o: " + i +", "+j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
		  }
			
		}
			
		sc.close();
	}

}
