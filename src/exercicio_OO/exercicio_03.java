package exercicio_OO;

import java.util.Scanner;

import entities.Aluno;

public class exercicio_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno =new Aluno();
				
		System.out.println("Digite o Nome:");
		aluno.nome=sc.nextLine();
		System.out.println("Digite as notas");
		aluno.nota1=sc.nextDouble();
		aluno.nota2=sc.nextDouble();
		aluno.nota3=sc.nextDouble();
		
		
		if(aluno.notaFinal()>= 60) {
		    		System.out.println("FINAL GRADE = "+aluno.notaFinal()+"\n"+"PASS");
		    	}else {
		    		double diferenca = aluno.notaFinal()-60;
		    		System.out.println("FINAL GRADE = "+aluno.notaFinal()+"\n"+
		    		"FAILED"+" MISSING "+ diferenca*-1 + " POINTS");
		    	}
		    }
		
	}


