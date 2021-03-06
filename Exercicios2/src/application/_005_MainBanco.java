package application;

import java.util.Locale;
import java.util.Scanner;

import entities._005_Account;

public class _005_MainBanco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		_005_Account conta;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new _005_Account(number, holder, initialDeposit);
		}
		else {
			conta = new _005_Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposit(depositValue);
		System.out.println("Update Account Data: ");
		System.out.println(conta);
		
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		conta.withdraw(withdrawValue);
		System.out.println("Update Account Data: ");
		System.out.println(conta);
		sc.close();
		
	}

}
