package classes;
import utils.Utils;

import java.util.Scanner;

import collections.BebidasCollection;
import parentClasses.Alimento;

public class Bebida extends Alimento{
	
	
	//Construtores
	
	public Bebida(String tipo, int precoDeVenda, String descricao){
		this.setTipo(tipo);
		this.setprecoDeVenda(precoDeVenda);
		this.setDescricao(descricao);
	}
	
	public Bebida(){

	}
	
	//Adicionar bebida
	public static void adicionarBebida() {
		
		System.out.println("Digite o nome da bebida: ");
		String descricao = Utils.scanner.next();
		System.out.println("Digite a preço de venda: ");
		int precoDeVenda = Utils.scanner.nextInt();
		String tipo = "Bebida";
		
		Bebida b = new Bebida(tipo, precoDeVenda, descricao);
		BebidasCollection.adicionarBebida(b);
		Utils.limparTela();
		System.out.println("Cadastro realizado com sucesso!");
		System.out.println("");
		System.out.println("- Bebida: " + b.descricao);
		System.out.println("- Preço de venda: " + b.precoDeVenda);
		
		System.out.println("");
		System.out.println("Digite [v] para voltar");
		
		String opcao = Utils.scanner.next();		
		if (opcao.equals("v")) {
			Menu.menuBebidas();
		}
		
	}
	
	//Deletar bebida
	public static void deletarBebida() {
		System.out.println("Digite o índice da bebida que deseja deletar: ");
		System.out.println("");
		listarBebidas();
		
		int id = Utils.scanner.nextInt();
		//String nome = BebidasCollection.listarBebidaIndividual(id);
		BebidasCollection.deletarBebidas(id);
		
		Utils.limparTela();
		//System.out.println(nome + "foi removido(a) da lista!");
		System.out.println("");
		System.out.println("Lista atualizada:");
		System.out.println("");
		BebidasCollection.listarBebidas();
		
	}
	
	//Alterar bebida
	public static void alterarBebida() {
		System.out.println("Digite o índice da bebida que deseja alterar: ");
		System.out.println("");
		listarBebidas();
		int id = Utils.scanner.nextInt();
		Utils.limparTela();
		BebidasCollection.listarBebidaIndividual(id);
		System.out.println("======================================"); 
		System.out.println("Digite um novo valor para 'Nome'"); 
		String n = Utils.scanner.next();
		System.out.println("Digite um novo valor para 'Preço de venda'");
		int p = Utils.scanner.nextInt();
		Bebida b = new Bebida("Bebida", p, n);
		BebidasCollection.alterarBebida(id, b);
		System.out.println("======================================"); 
		BebidasCollection.listarBebidaIndividual(id);
		System.out.println("");
		System.out.println("Digite [v] para voltar");
		
		String opcao = Utils.scanner.next();		
		if (opcao.equals("v")) {
			Menu.menuBebidas();
		}
		
	}
	
	
	//Listar bebidas
	public static void listarBebidas() {	
		BebidasCollection.listarBebidas();
	}
	
	
}
