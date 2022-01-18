package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Programm {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.next();
		System.out.printf("Gross Salary: ");
		employee.gross_Salary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
				
		System.out.println(employee.toString());
		System.out.printf("Which percentage to increase salary?");
		double porcentage = sc.nextDouble();
		employee.increaseSalary(porcentage);
		
		
		sc.close();

	}

}
