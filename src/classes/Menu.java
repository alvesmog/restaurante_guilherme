package classes;

import utils.Utils;

public class Menu {

	public static void menuInicial() {
		
		System.out.println("Sistema de Restaurante");
		System.out.println("");
		System.out.println("Selecione a opção desejada:");
		System.out.println("");
		System.out.println("1 - Fazer pedido");
		System.out.println("2 - Cadastrar");

		String opcao = Utils.scanner.next();

		if (opcao.equals("1")) {
			// Tela de pedidos
		} else if (opcao.equals("2")) {
			// Tela de cadastros
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
			// Tela de cliente
		} else if (opcao.equals("2")) {
			Utils.limparTela();
			menuComidas();
		} else if (opcao.equals("3")) {
			Utils.limparTela();
			menuBebidas();
		}else if (opcao.equals("v")) {
			Utils.limparTela();
			menuInicial();
		}

	}
	
	public static void menuEspecifico(String e) {
		
		Utils.limparTela();
		
		String especifico = e.toLowerCase()+"s";
		
		System.out.println("Tela de " + especifico);
		System.out.println("");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Listar");
		System.out.println("3 - Alterar");
		System.out.println("4 - Deletar");
		System.out.println("");
		System.out.println("Digite [v] para voltar");

				
	}

	public static void menuBebidas() {
			
		menuEspecifico("Bebida");

		String opcao = Utils.scanner.next();
		if (opcao.equals("1")) {
			// Tela de cadastro
			Utils.limparTela();
			Bebida.adicionarBebida();

		} else if (opcao.equals("2")) {
			// Tela de listar
			Utils.limparTela();
			Bebida.listarBebidas();

		} else if (opcao.equals("3")) {
			Utils.limparTela();
			Bebida.alterarBebida();

		} else if (opcao.equals("4")) {
			// Deletar
			Utils.limparTela();
			Bebida.deletarBebida();

		} else if (opcao.equals("v")) {
			// Voltar para cadastros
			menuCadastros();
		}
	}

	public static void menuComidas() {
	
		menuEspecifico("Comida");

		String opcao = Utils.scanner.next();
		if (opcao.equals("1")) {
			// Tela de cadastro
			Utils.limparTela();
			Comida.adicionarComida();

		} else if (opcao.equals("2")) {
			// Tela de listar
			Utils.limparTela();
			Comida.listarComidas();

		} else if (opcao.equals("3")) {
			Utils.limparTela();
			Comida.alterarComida();

		} else if (opcao.equals("4")) {
			// Deletar
			Utils.limparTela();
			Comida.deletarComida();

		} else if (opcao.equals("v")) {
			// Voltar para cadastros
			menuCadastros();

		}

	}
	
	public static void menuClientes() {
		
		menuEspecifico("Cliente");

		String opcao = Utils.scanner.next();
		if (opcao.equals("1")) {
			// Tela de cadastro
			Utils.limparTela();
			Cliente.adicionarCliente();

		} else if (opcao.equals("2")) {
			// Tela de listar
			Utils.limparTela();
			Cliente.listarClientes();

		} else if (opcao.equals("3")) {
			Utils.limparTela();
			Cliente.alterarCliente();

		} else if (opcao.equals("4")) {
			// Deletar
			Utils.limparTela();
			Cliente.deletarCliente();

		} else if (opcao.equals("v")) {
			// Voltar para cadastros
			menuCadastros();

		}

	}

}
