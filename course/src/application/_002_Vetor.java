package application;

import java.util.Locale;
import java.util.Scanner;

import entities._002_Product;


public class _002_Vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		double sum = 0.0;
		double avg = 0.0;
		n = sc.nextInt();
		
		_002_Product[] vect = new _002_Product[n];

		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new _002_Product(name, price);
		}
		
		for (int i=0; i<vect.length ;i++) {
			sum = sum + vect[i].getPrice();
		}
		
		avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%",avg);
		
		
		sc.close();
		
		
	}

}
