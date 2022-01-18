package programa;

//Importações...
import java.util.Locale;
import java.util.Scanner;
import entidade.Produto;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		System.out.println("Entre com os dados do Produto:");
		System.out.print("Nome:");
		produto.nome = sc.next();
		System.out.printf("Preço:");
		produto.preco = sc.nextDouble();
		System.out.printf("Quantidade:");
		produto.quantidade = sc.nextInt();
		
		System.out.println("Dados do Produto: "	+ produto.toString());
		System.out.println("Quantos produtos deseja adcionar no estoque?");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		System.out.println("Atualização do Produto em estoque: " + produto.toString());
		
		System.out.println("Quantos produtos deseja Remover do estoque?");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		System.out.println("Atualização do Produto em estoque: " + produto.toString());
				
		sc.close();

	}

}
