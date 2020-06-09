import java.util.Locale;
import java.util.Scanner;

public class _003_ExercWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

/* EXERCICIO 1 */	
/*		
		int senhaEntrada;
		int senhaCorreta = 2002;
		
		senhaEntrada = sc.nextInt();	
		
		while (senhaEntrada != senhaCorreta) {
			System.out.println("Senha Invalida");
			senhaEntrada = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		sc.close();
*/		
		
/* EXERCICIO 2 */	
/*		
		int x;
		int y;
		
		x = sc.nextInt();
		y = sc.nextInt();		
		
		
		while (x != 0 && y!= 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");				
			}
			
			if (x < 0 && y > 0) {
				System.out.println("Segundo");				
			}
			
			if (x < 0 && y < 0) {
				System.out.println("Terceiro");				
			}
			
			if (x > 0 && y < 0) {
				System.out.println("Quarto");				
			}
			
			x = sc.nextInt();
			y = sc.nextInt();			
		}
		
		sc.close();
		
		System.out.println("Uma das coordenadas em ZERO");
*/		
		
		
/* EXERCICIO 3 */	
		
		int codigo = 0;
		int qnt1 = 0;
		int qnt2 = 0;
		int qnt3 = 0;
		
		codigo = sc.nextInt();

		while (codigo != 0) {
		
			if (codigo == 1) {
				qnt1 = qnt1 + 1;	
			}
			
			if (codigo == 2) {
				qnt2 = qnt2 + 1;	
			}
			
			if (codigo == 3) {
				qnt3 = qnt3 + 1;	
			}
			
			if (codigo == 4) {
				System.out.println("MUITO OBRIGADO");	
				System.out.printf("Alcool = %d%n",qnt1);
				System.out.printf("Gasolina = %d%n",qnt2);
				System.out.printf("Diesel = %d%n",qnt3);
			}

			if (codigo == 0 || codigo > 4) {
				System.out.println("Codigo Invalido, tente novamente (1 a 3)");
			}
			
			codigo = sc.nextInt();
		}
			
		while (codigo == 0) {
			System.out.println("Codigo Invalido, tente novamente (1 a 3)");	
			codigo = sc.nextInt();
		}

		
		
		sc.close();
	}

}
