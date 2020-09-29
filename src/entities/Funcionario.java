package entities;

import java.util.Locale;

public class Funcionario {

	public String nome;
	public double salario;
	public double imposto;

	public double liquido() {

		return salario - imposto;

	}
	
	public void ajuste(double ajusteSalario) {
		 
		salario += salario *  ajusteSalario/100;
	}
   
	public String toString() {
		Locale.setDefault(Locale.US);
		return  nome+", $" +String.format("%.2f", liquido());
		
	}
}
