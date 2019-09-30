package classes;
import utils.Utils;

import java.util.Scanner;

import collections.ComidasCollection;
import parentClasses.Alimento;

public class Comida extends Alimento{
	
	
	//Construtores
	
	public Comida(String tipo, String unidadeDeVenda, String descricao){
		this.setTipo(tipo);
		this.setUnidadeDeVenda(unidadeDeVenda);
		this.setDescricao(descricao);
	}
	
	public Comida(){

	}
	
	//Adicionar comida
	public static void adicionarComida() {
		
		System.out.println("Digite o nome da comida: ");
		String descricao = Utils.scanner.next();
		System.out.println("Digite a unidade de venda: ");
		String unidadeDeVenda = Utils.scanner.next();
		String tipo = "Comida";
		
		Comida b = new Comida(tipo, descricao, unidadeDeVenda);
		ComidasCollection.adicionarComida(b);
		Utils.limparTela();
		System.out.println("Cadastro realizado com sucesso!");
		System.out.println("");
		System.out.println("- Comida: " + b.descricao);
		System.out.println("- Unidade de venda: " + b.unidadeDeVenda);
		
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
		System.out.println("Digite um novo valor para 'Unidade de venda'");
		String u = Utils.scanner.next();
		Comida b = new Comida("Comida", u, n);
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
