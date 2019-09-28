package classes;
import utils.Utils;
import collections.BebidasCollection;
import parentClasses.Alimento;

public class Bebida extends Alimento{
	
	
	//Construtor
	
	public Bebida(String tipo, String unidadeDeVenda, String descricao){
		this.setTipo(tipo);
		this.setUnidadeDeVenda(unidadeDeVenda);
		this.setDescricao(descricao);
	}
	
	//Adicionar bebida

	void adicionarBebida() {
		
		System.out.println("Digite o nome da bebida: ");
		this.descricao = Utils.scanner.next();
		System.out.println("Digite a unidade de venda: ");
		this.unidadeDeVenda = Utils.scanner.next();
		this.tipo = "Bebida";
		
		Bebida b = new Bebida(tipo, descricao, unidadeDeVenda);
		BebidasCollection.adicionarBebida(b);
		
	}
	
	//Deletar bebida
	
	//Alterar bebida
	
	//Listar bebidas
	
	
}
