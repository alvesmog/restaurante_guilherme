package classes;

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
		System.out.println("Digite [0] para voltar");
		
		String opcao = Utils.scanner.next();
		
		if (opcao.equals("1")) {
			//Tela de cliente
		} else if (opcao.equals("2")) {
			//Tela de comida
		} else if (opcao.equals("0")) {
			Utils.limparTela();
			menuInicial();			
		}
		
	}

}

