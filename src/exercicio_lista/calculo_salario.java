package exercicio_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.calculoSalario;

public class calculo_salario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<calculoSalario> list = new ArrayList<>();

		System.out.println("Quantidades de Funcionarios: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Funcionario #" + (i + 1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salario: ");
			Double salario = sc.nextDouble();

			calculoSalario funcionario = new calculoSalario(id, nome, salario);

			list.add(funcionario);

		}
		System.out.println("ID de usuraio que tera o salario incrementado");
		int idsalario = sc.nextInt();

		Integer pos = position(list, idsalario);
		if (pos == null) {
			System.out.println("ID inexistente");
		} else {
			System.out.println("Percentual de aumento: ");
			double percent = sc.nextDouble();
			list.get(pos).incrementoSalario(percent);
		}
		System.out.println();
		System.out.println("Lista de Funcionarios:");
		for (calculoSalario emp : list) {
			System.out.println(emp);
		}

		sc.close();
	}

	public static Integer position(List<calculoSalario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}

		}
		return null;
	}
}
