package aplication;

public class CurrencyConverter {
	
	public static double dollar;
	public static double real;
	public static final double IOF = 0.06;
	
	
	public static double conversor(double dollar, double real) {
		return ((dollar * real) + dollar * real * IOF);
	}
	
}
