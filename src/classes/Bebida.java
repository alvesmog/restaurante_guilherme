package classes;
import utils.Utils;

import parentClasses.Alimento;

public class Bebida extends Alimento{
	
	
	//Construtor
	
	Bebida(String tipo, String unidadeDeVenda, String descricao){
		
	}
	
	//Adicionar bebida

	void adicionarBebida() {
		System.out.println("Digite o nome da bebida: ");
		this.descricao = Utils.scanner.next();
		System.out.println("Digite a unidade de venda: ");
		this.unidadeDeVenda = Utils.scanner.next();
		
		this.tipo = "Bebida";
		
		Bebida b = new Bebida(tipo, descricao, unidadeDeVenda);		 
		
	}
	
	//Deletar bebida
	
	//Alterar bebida
	
	//Listar bebidas
	
	
}
