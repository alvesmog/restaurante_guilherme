package classes;
import utils.Utils;

import java.util.Scanner;

import collections.ComidasCollection;
import parentClasses.Alimento;

public class Comida extends Alimento{
	
	
	//Construtores
	
	public Comida(String tipo, String descricao, int precoDeVenda){
		this.setTipo(tipo);
		this.setDescricao(descricao);
		this.setprecoDeVenda(precoDeVenda);
	}
	
	public Comida(){

	}
	
	//Adicionar comida
	public static void adicionarComida() {
		
		System.out.println("Digite o nome da comida: ");
		String descricao = Utils.scanner.next();
		System.out.println("Digite um preço de venda: ");
		int precoDeVenda = Utils.scanner.nextInt();
		System.out.println("Digite o tipo: ");
		System.out.println("1 - Entrada");
		System.out.println("2 - Prato Principal");
		System.out.println("3 - Sobremesa");
		String tipo = Utils.scanner.next();
		
		Comida b = new Comida(tipo, descricao, precoDeVenda);
		ComidasCollection.adicionarComida(b);
		Utils.limparTela();
		System.out.println("Cadastro realizado com sucesso!");
		System.out.println("");
		System.out.println("- Comida: " + b.descricao);
		System.out.println("- Preço de venda: " + b.precoDeVenda);
		System.out.println("- Tipo: " + b.tipo);
		
		System.out.println("");
		System.out.println("Digite [v] para voltar");
		
		String opcao = Utils.scanner.next();		
		if (opcao.equals("v")) {
			Menu.menuComidas();
		}
		
	}
	
	//Deletar comida
	public static void deletarComida() {
		System.out.println("Digite o índice da comida que deseja deletar: ");
		System.out.println("");
		listarComidas();
		String opcao = "0";
		int id = Utils.scanner.nextInt();
		//String nome = ComidasCollection.listarBebidaIndividual(id);
		ComidasCollection.deletarComidas(id);
		
		Utils.limparTela();
		//System.out.println(nome + "foi removido(a) da lista!");
		System.out.println("");
		System.out.println("Lista atualizada:");
		System.out.println("");
		ComidasCollection.listarComidas();
		
	}
	
	//Alterar comida
	public static void alterarComida() {
		System.out.println("Digite o índice da comida que deseja alterar: ");
		System.out.println("");
		listarComidas();
		int id = Utils.scanner.nextInt();
		Utils.limparTela();
		ComidasCollection.listarComidaIndividual(id);
		System.out.println("======================================"); 
		System.out.println("Digite um novo valor para 'Nome'"); 
		String n = Utils.scanner.next();
		System.out.println("Digite um novo valor para 'Preço de venda'");
		int p = Utils.scanner.nextInt();
		System.out.println("Digite o tipo: ");
		System.out.println("1 - Entrada");
		System.out.println("2 - Prato Principal");
		System.out.println("3 - Sobremesa");
		String tipo = Utils.scanner.next();
		Comida b = new Comida(tipo, n, p);
		ComidasCollection.alterarComida(id, b);
		System.out.println("======================================"); 
		ComidasCollection.listarComidaIndividual(id);
		System.out.println("");
		System.out.println("Digite [v] para voltar");
		
		String opcao = Utils.scanner.next();		
		if (opcao.equals("v")) {
			Menu.menuComidas();
		}
		
	}
	
	
	//Listar comidas
	public static void listarComidas() {	
		ComidasCollection.listarComidas();
	}
	
	
}
