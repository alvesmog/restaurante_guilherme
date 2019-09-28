package classes;
import utils.Utils;

import java.util.Scanner;

import collections.BebidasCollection;
import parentClasses.Alimento;

public class Bebida extends Alimento{
	
	
	//Construtores
	
	public Bebida(String tipo, String unidadeDeVenda, String descricao){
		this.setTipo(tipo);
		this.setUnidadeDeVenda(unidadeDeVenda);
		this.setDescricao(descricao);
	}
	
	public Bebida(){

	}
	
	//Adicionar bebida

	public static void adicionarBebida() {
		
		System.out.println("Digite o nome da bebida: ");
		String descricao = Utils.scanner.next();
		System.out.println("Digite a unidade de venda: ");
		String unidadeDeVenda = Utils.scanner.next();
		String tipo = "Bebida";
		
		Bebida b = new Bebida(tipo, descricao, unidadeDeVenda);
		BebidasCollection.adicionarBebida(b);
		Utils.limparTela();
		System.out.println("Cadastro realizado com sucesso!");
		System.out.println("");
		System.out.println("- Bebida: " + b.descricao);
		System.out.println("- Unidade de venda: " + b.unidadeDeVenda);
		
		System.out.println("");
		System.out.println("Digite [0] para voltar");
		
		String opcao = Utils.scanner.next();		
		if (opcao.equals("0")) {
			main.menuBebidas();
		}
		
	}
	
	//Deletar bebida
	
	public static void deletarBebida() {
		System.out.println("Digite o índice da bebida que deseja deletar: ");
		listarBebidas();
		
		int id = Utils.scanner.nextInt();
		String nome = BebidasCollection.listarBebidaIndividual(id);
		BebidasCollection.deletarBebidas(id);
		
		Utils.limparTela();
		System.out.println(nome + "foi removido(a) da lista!");
		System.out.println("");
		System.out.println("Lista atualizada:");
		System.out.println("");
		BebidasCollection.listarBebidas();
		
	}
	
	//Alterar bebida
	
	//Listar bebidas
	public static void listarBebidas() {	
		BebidasCollection.listarBebidas();
	}
	
	
}
