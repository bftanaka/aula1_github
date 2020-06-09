package application;

import java.util.Locale;
import java.util.Scanner;

import entities._002_Employee;

public class _002_Empregado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		_002_Employee Funcionario;
		Funcionario = new _002_Employee();
		
		System.out.println("Enter Dados Funcionario (Nome, Salario, Imposto): ");
		Funcionario.nome = sc.nextLine();
		Funcionario.grossSalary = sc.nextDouble();
		Funcionario.tax = sc.nextDouble();
		
		
		System.out.printf("Nome = %s%n", Funcionario.nome);
		System.out.printf("Gross Salary = %.2f%n", Funcionario.grossSalary);
		System.out.printf("Tax = %.2f%n", Funcionario.tax);
		
		System.out.printf("Employee: %s, $ %.2f%n", Funcionario.nome , Funcionario.salarioLiquido());
		System.out.println("Which percentage to increase salary? ");
		Funcionario.increaseSalary = sc.nextDouble();
		
		System.out.printf("Update Data: %s, $ %.2f%n", Funcionario.nome , Funcionario.updateSalary());
		
		sc.close();
	}

}
