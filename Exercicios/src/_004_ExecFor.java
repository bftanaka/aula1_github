import java.util.Locale;
import java.util.Scanner;

public class _004_ExecFor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
/* EXERCICIO 1 */
/*		
	
		
		Scanner sc = new Scanner(System.in);
				
		int x;
		int i;
		
		x = sc.nextInt();
		
		sc.close();

		if (x < 1 || x >1000) {
			System.out.println("Valor invalido. O valor deve estar entre 1 e 1000");
		}
		
		
		if (x >= 1 && x <=1000){
			for (i=0; i<=x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);	
				}
			}
		}
*/	
		
/* EXERCICIO 2 */
/*		
		
		Scanner sc = new Scanner(System.in);
				
		int n;
		int x;
		int i;
		int somain = 0;
		int somaout = 0;
		
		n = sc.nextInt();
		
		
		
		for (i = 0 ; i < n ; i++) {
		
			x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				somain = somain +1;
			}
			
			else {
				somaout = somaout +1;
			}			

		}
		
		sc.close();
		
		System.out.println(somain + " in");
		System.out.println(somaout + " out");
*/		
		
/* EXERCICIO 3 */
		
/*		
		Scanner sc = new Scanner(System.in);
				
		int n;
		double nota;
		int i;
		int in;
		
		double valor1 = 0;
		double valor2 = 0;
		double valor3 = 0;
		double media = 0;
		
		n = sc.nextInt();
		
		
			
			for (i=0 ; i<n ; i++) {
				
				valor1 = sc.nextDouble();
				valor2 = sc.nextDouble();
				valor3 = sc.nextDouble();
				
				media = (valor1*2 + valor2*3 + valor3*5) / 10;
				
				System.out.printf("MEDIA = %.1f%n" , media);	
			}			
			
		
		sc.close();
*/		
		
/* EXERCICIO 4 */
		
/*		
		Scanner sc = new Scanner(System.in);
				
		int n;
		double a;
		double b;
		int i;
		double resultado = 0;
		
		n = sc.nextInt();
		
		for (i=0 ; i<n ; i++) {
			
			a = sc.nextDouble();
			b = sc.nextDouble();
			
			if (b == 0) {
				System.out.println("Divisao Impossivel");
			}
			else {
				resultado = (a/b);
				System.out.printf("%.1f%n", resultado);
			}
						
		}
		
		sc.close();
		
*/		
		
		
/* EXERCICIO 5 */
		
/*		
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();
*/		
		
		
/* EXERCICIO 6 */
		
/*		
		Scanner sc = new Scanner(System.in);
				
		int n;
		int i;
		
		n = sc.nextInt();
		
		

		for (i=1; i<=n; i++) {
			
			if (n%i == 0) {
				System.out.println(i);
			}
		}
		

		
		sc.close();
		
*/		
		
/* EXERCICIO 7 */
		
		
		Scanner sc = new Scanner(System.in);
				
		int n;
		int i;
		
		double a;
		double b;
		
		n = sc.nextInt();
		
		

		for (i=1; i<=n; i++) {
			
			a = Math.pow(i, 2);
			b = Math.pow(i, 3);
			
			System.out.printf("%d %.0f %.0f%n", i , a , b);
		}
		
		
		sc.close();
		
	}

}
