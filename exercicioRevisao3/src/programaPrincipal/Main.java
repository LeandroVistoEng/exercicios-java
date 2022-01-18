package programaPrincipal;

import java.util.Locale;
import java.util.Scanner;
import aplication.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		// Objetos
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Para encerrar o programa aperte 'n'.");
		String inicio = sc.next();
		while (inicio != "n") {

				System.out.print("What is the dollar price? ");
				double real = sc.nextDouble();
				System.out.print("How many dollars will be bought? ");
				double dollar = sc.nextDouble();
				System.out.print("Amount to be paid in Reais = ");
				
				System.out.print(CurrencyConverter.conversor(dollar, real) + "\n");
				
				inicio = sc.next();
		}
		System.out.println("\n\n\nFim do programa");

		sc.close();

	}

}
