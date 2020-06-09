package application;

import java.util.Locale;
import java.util.Scanner;

import entities._001_Rectangle;

public class _001_Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		_001_Rectangle retangulo;
		
		retangulo = new _001_Rectangle();
		

		System.out.println("Enter rectangle width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		
		System.out.printf("Area = %.2f%n", retangulo.area());
		System.out.printf("Perimeter = %.2f%n", retangulo.perimeter());
		System.out.printf("Diagonal = %.2f%n", retangulo.diagonal() );		
		
		sc.close();
	}

}
