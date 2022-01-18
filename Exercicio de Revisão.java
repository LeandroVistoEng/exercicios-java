
import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Exercicio medição de terreno retangular.
		double largura, comprimento, areaTotal, precoMetroQuadrado, valorTotal;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//Entrada de dados:
		System.out.println("Por favor digite a largura do lote:");
		largura = sc.nextDouble();
		System.out.println("Agora digite o comprimento do lote:");
		comprimento = sc.nextDouble();
		System.out.println("Agora informe o preço por metro quadrado:");
		precoMetroQuadrado = sc.nextDouble();
		
		//Saida de dados:
		areaTotal = largura * comprimento;
		valorTotal = areaTotal * precoMetroQuadrado;
		
		//Impressão dos dados:
		System.out.printf("\n\nÁrea Total do lote: %.2f\n"
				+ "Valor do Terreno: %.2f\n"
				+ "Largura: %.1f\n"
				+ "Comprimento: %.1f\n"
				+ "Preço do Metro Quadrado: %.2f\n\n"
				+ "Fim do Relatorio.", areaTotal, valorTotal, largura, comprimento, precoMetroQuadrado);
		
		sc.close();
	}

}
