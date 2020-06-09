
import java.util.Locale;
import java.util.Scanner;

public class _001_ExercOperMat {

	public static void main(String[] args) {

/* EXERCICIO 1 */
/*
		int valor1; 
		int valor2;
		
		int total;
		
		Scanner sc = new Scanner(System.in);
		
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		
		sc.close();
		
		total = valor1 + valor2;
		
		
		System.out.println("Operacao:");
		System.out.printf("%d + %d%n", valor1, valor2);
		System.out.printf("Total = %d%n", total);
*/

/* EXERCICIO 2 */
/*		
		double raio;
		double pi;
		double raio2;
		double area;
		
		pi = 3.14159;
				
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		raio = sc.nextDouble();
		
		sc.close();
		
		raio2 = Math.pow(raio, 2);
		
		area = raio2 * pi;
		
		System.out.println("raio2 = " + raio2);
		System.out.println("Raio = " + raio);
		System.out.printf("Area = %.4f%n", area);
*/
		
/* EXERCICIO 3 */
/*		
		int A;
		int B;
		int C;
		int D;
		int dif;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		sc.close();
		
		dif = ((A*B)-(C*D));
		
		System.out.println("Diferenca = " + dif);
*/
	
/* EXERCICIO 4 */		
/*		
		int func;
		double hora;
		double valorHora;
		double salario;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		func = sc.nextInt();
		hora = sc.nextDouble();
		valorHora = sc.nextDouble();

		sc.close();
		
		salario = (valorHora * hora);
		
		System.out.println("NUMBER = " + func);
		System.out.printf("SALARY = U$ %.2f%n" , salario);
*/		
		
/* EXERCICIO 5 */		
/*		
		int cod1;
		int qnt1;
		double valor1;
		
		int cod2;
		int qnt2;
		double valor2;
		
		double total;

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
			cod1 = sc.nextInt();
			qnt1 = sc.nextInt();
			valor1 = sc.nextDouble();	
			
			cod2 = sc.nextInt();
			qnt2 = sc.nextInt();
			valor2 = sc.nextDouble();
		
		sc.close();
		
		total = ((qnt1 * valor1) + (qnt2 * valor2));
		
		System.out.printf("VALOR A PAGAR = R$ %.2f%n" , total);
*/		
		
/* EXERCICIO 6 */		
		
		float A;
		float B;
		float C;
		
		double pi;

		float triangulo;
		float circulo;
		float trapezio;
		float quadrado;
		float retangulo;
		
		pi = 3.14159;

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		sc.close();
		
		triangulo = (A * C) /2;
		
		circulo = (float) ((Math.pow(C, 2)) * pi);
		
		trapezio = (((A + B) * C) / 2);
		
		quadrado = (float) Math.pow(B, 2);
		
		retangulo = (A * B);
		
		
		System.out.printf("TRIANGULO =  %.3f%n" , triangulo);
		System.out.printf("CIRCULO =  %.3f%n" , circulo);
		System.out.printf("TRAPEZIO =  %.3f%n" , trapezio);
		System.out.printf("QUADRADO =  %.3f%n" , quadrado);
		System.out.printf("RETANGULO =  %.3f%n" , retangulo);
		
	}

}
