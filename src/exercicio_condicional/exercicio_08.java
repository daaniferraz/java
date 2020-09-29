package exercicio_condicional;

import java.util.Scanner;

public class exercicio_08 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		
		double salario=sc.nextDouble();
		double temp;
    if(salario <= 2000) {
    	System.out.println("Isento");
     }else
    	 if(salario >= 2000.01 && salario<=3000) {
    		temp = (salario-2000) *0.08;
    		salario = salario-temp;
    		System.out.printf("Imposto R$ %.2f%n",temp);
    	 }else
        	 if(salario >= 3000.01 && salario<=4500) {
         		temp = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
         		salario = salario-temp;
         		System.out.printf("Imposto R$ %.2f%n",temp);
         	 }else
            	 if(salario >= 4500 ) {
             		temp = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
             		salario = salario-temp;
             		System.out.printf("Imposto R$ %.2f%n",temp);
             	 }
    sc.close();
	}

}
