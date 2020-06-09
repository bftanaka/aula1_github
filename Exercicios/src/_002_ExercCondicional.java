import java.util.Locale;
import java.util.Scanner;

public class _002_ExercCondicional {

	public static void main(String[] args) {
		
/* EXERCICIO 1 */
/*		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		a = sc.nextInt();
		
		sc.close();
		
		if (a < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		
*/		
		
/* EXERCICIO 2 */
/*		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		double n2;
		
		n = sc.nextInt();
		
		sc.close();
		
		n2 = n%2;
				
		if ((n2 == 0)) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
*/		
		
/* EXERCICIO 3 */
/*		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;

		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.close();
		
		if ((a%2 == 0) && (b%2 == 0)) {
			System.out.println("SAO MULTIPLOS");
		}
		else
			System.out.println("NAO SAO MULTIPLOS");
		}
*/
	
/* EXERCICIO 4 */
/*	
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	
	int horaI;
	int horaF;
	int horaTotal;
	
	horaI = sc.nextInt();
	horaF = sc.nextInt();
	
	sc.close();
	
		
		if (horaI > horaF) {
			horaTotal = (24 - horaI) + horaF;
		}
		else {
			horaTotal = (horaF - horaI);
			}
		
		if (horaI == horaF) {
			horaTotal = 24;
		}
		
		
		System.out.printf("O JOGO DUROU %d HORA(S)" , horaTotal);
		
*/		
		
/* EXERCICIO 5 */
/*		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		int item;
		int qnt;
		double valor = 0;
		
		codigo = sc.nextInt();
		qnt = sc.nextInt();
		
		sc.close();
		
		if (codigo == 1) {
			valor = (qnt * 4 ); 
		}
		
		if (codigo == 2) {
			valor = (qnt * 4.5 ); 
		}
		
		if (codigo == 3) {
			valor = (qnt * 5 ); 
		}
		
		if (codigo == 4) {
			valor = (qnt * 2 ); 
		}
		
		if (codigo == 5) {
			valor = (qnt * 1.5 ); 
		}
		
		System.out.printf("TOTAL: R$ %.2f%n" , valor);
*/		
		
/* EXERCICIO 6 */
/*		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double valorEntrada;

		
		valorEntrada = sc.nextDouble();
		
		sc.close();
		
		if (valorEntrada >= 0 && valorEntrada <= 100) {
			if (valorEntrada >= 0 && valorEntrada <= 25){
				System.out.println("INTERVALO (0,25)");
			}
			if (valorEntrada > 25 && valorEntrada <= 50){
				System.out.println("INTERVALO (25,50)");			
			}
			if (valorEntrada > 50 && valorEntrada <= 75){
				System.out.println("INTERVALO (50,75)");			
			}
			if (valorEntrada > 75 && valorEntrada <= 100){
				System.out.println("INTERVALO (75,100)");			
			}
		}
			
		if (valorEntrada < 0 || valorEntrada > 100){
			System.out.println("FORA DE INTERVALO");
		}
*/	
		
/* EXERCICIO 7 */
/*		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		double y;

		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		sc.close();
		
		if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");						
		}
		
		if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");						
		}
		
		if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");						
		}
		
		if (x > 0.0 && y < 0.0) {
			System.out.println("Q4");						
		}
				
		if (x == 0.0 && y == 0.0) {
			System.out.println("ORIGEM");						
		}
		
		if (x == 0.0 && y != 0.0) {
			System.out.printf("Em X e Y em %.1f%n", y);					
		}
		
		if (y == 0.0 && x != 0.0) {
			System.out.printf("Em Y e X em %.1f%n", x);					
		}
*/		
		
/* EXERCICIO 8 */
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double salario;
		double imposto;
		double tx1 = 0;
		double tx2 = 0;
		double tx3 = 0;
		
		salario = sc.nextDouble();
		
		sc.close();
		
		if (salario > 0.00 && salario < 2000.00) {
			System.out.println("ISENTO");	
		}
		
		if (salario > 2000.01 && salario < 3000.0) {
			tx1 = (salario - 2000.00) * 0.08; 
		}
		
		if (salario > 3000.01 && salario < 4500.0) {
			tx1 = 1000.00 * 0.08;
			tx2 = (salario - 3000.00) * 0.18; 
			
		}
		
		if (salario > 4500.01) {
			tx1 = 1000.00 * 0.08;
			tx2 = 1500.00 * 0.18; 
			tx3 = (salario - 4500) * 0.28; 
		}
		
		imposto = tx1 + tx2 + tx3;
		
		if (salario > 2000) {
		System.out.printf("IMPOSTO R$ %.2f%n", imposto);
		}
		
		System.out.printf("%.2f%n",tx1);
		System.out.printf("%.2f%n",tx2);
		System.out.printf("%.2f%n",tx3);
}
}


