import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;
public class Main {

	public static void main(String[] args) {
		// Exercicio de Fixação...
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the Measure of Triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the Measure of Triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		if(areaX > areaY) {
			System.out.println("Área do Triangulo (X) é a Maior");
		} else {
			System.out.println("Área do Triangulo (Y) é a Maior");
		}
		
		System.out.printf("X: %.2f Y: %.2f", areaX, areaY);
		
		sc.close();

	}

}
