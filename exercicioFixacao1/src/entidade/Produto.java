package entidade;

public class Produto {
	//Declaração de variaveis...
		public String nome;
		public double preco;
		public int quantidade;
		
		//Desenvolvimento de funções...
		public double valorTotalEstoque() {
			return quantidade * preco;
		}
		public void addProduto(int quantidade) {
			this.quantidade += quantidade;
		}
		public void removerProduto(int quantidade) {
			this.quantidade -= quantidade;
		}
		public String toString(){
			return nome + ", $" + preco + ",  " + quantidade + " Unidades, " +
					"Total: " + valorTotalEstoque();		
		}
}
