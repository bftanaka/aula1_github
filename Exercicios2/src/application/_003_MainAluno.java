package application;

import java.util.Locale;
import java.util.Scanner;

import entities._003_Aluno;

public class _003_MainAluno {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		_003_Aluno Aluno;
		Aluno = new _003_Aluno();

		Aluno.nome = sc.nextLine();
		Aluno.nota1 = sc.nextDouble();
		Aluno.nota2 = sc.nextDouble();
		Aluno.nota3 = sc.nextDouble();
		
		System.out.println(Aluno);
	
		sc.close();
	}

}
