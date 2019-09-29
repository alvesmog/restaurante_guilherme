package classes;

import collections.BebidasCollection;
import utils.Utils;

public class main {
	
	public static void main(String[] args) {
		menuInicial();			
	}
	
	public static void menuInicial(){
		System.out.println("Sistema de Restaurante");
		System.out.println("");
		System.out.println("Selecione a opção desejada:");
		System.out.println("");
		System.out.println("1 - Fazer pedido");
		System.out.println("2 - Cadastrar");
		
		String opcao = Utils.scanner.next();
		
		if (opcao.equals("1")) {
			//Tela de pedidos
		} else if (opcao.equals("2")) {
			//Tela de cadastros
			menuCadastros();
		}
		
	}
	
	public static void menuCadastros() {
		Utils.limparTela();
		System.out.println("Tela de cadastros");
		System.out.println("");
		System.out.println("1 - Cliente");
		System.out.println("2 - Comida");
		System.out.println("3 - Bebida");
		System.out.println("");
		System.out.println("Digite [v] para voltar");
		
		String opcao = Utils.scanner.next();		
		if (opcao.equals("1")) {
			//Tela de cliente
		} else if (opcao.equals("2")) {
			//Tela de comida
		} else if (opcao.equals("3")) {
			Utils.limparTela();
			menuBebidas();			
		}
		
	}
	
	public static void menuBebidas() {
		
		Utils.limparTela();		
		System.out.println("Tela de Bebidas");
		System.out.println("");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Listar");
		System.out.println("3 - Alterar");
		System.out.println("4 - Deletar");
		System.out.println("");
		System.out.println("Digite [v] para voltar");
		
		String opcao = Utils.scanner.next();	
		if (opcao.equals("1")) {
			//Tela de cadastro
			Utils.limparTela();
			Bebida.adicionarBebida();
							
		} else if (opcao.equals("2")) {
			//Tela de listar
			Utils.limparTela();
			Bebida.listarBebidas();
			
		} else if (opcao.equals("3")) {
			Utils.limparTela();
			Bebida.alterarBebida();
			
		} else if (opcao.equals("4")) {
			//Deletar
			Utils.limparTela();
			Bebida.deletarBebida();
		
		} else if (opcao.equals("v")) {
			//Voltar para cadastros
			menuCadastros();
		
		}
		
			
	}

}

