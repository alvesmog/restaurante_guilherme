package classes;

import collections.BebidasCollection;
import collections.ClientesCollection;
import collections.ComidasCollection;
import utils.Utils;

public class Pedido {
		
	Pedido(Cliente cl, Comida c1, Comida c2, Comida c3, Bebida b){
		
	}
	
	Pedido(Cliente cl, Comida c1, Comida c2,  Bebida b){
		
	}
	
	Pedido(Cliente cl, Comida c1, Bebida b){
		
	}
	
	Pedido(Cliente cl,  Bebida b){
		
	}
	
	Pedido(Cliente cl, Comida c1, Comida c2, Comida c){
		
	}
	
	Pedido(Cliente cl, Comida c1, Comida c2){
		
	}
	
	Pedido(Cliente cl, Comida c1){
		
	}
		
	Pedido(){
		
	}
	
	public void realizarPedido() {
		
		Utils.limparTela();
		
		int construtor = 0;
		
		//Obtendo o cliente		
		System.out.println("Escolha um cliente abaixo [ID]: ");
		ClientesCollection.listarClientes();
		String client_id = Utils.scanner.next();
		Utils.limparTela();
		
		//Obtendo a opção de entrada
		System.out.println("Escolha uma entrada. Caso n�o deseje uma entrada, digite 'N':");
		System.out.println("ID | Descrição");
		//Essa fun��o itera a cole��o de comidas e retorna apenas as do tipo "Entrada"
		for(int i = 0; i<ComidasCollection.obterTamanhoDaLista();i++) { 		
			if(ComidasCollection.obterComida(i).getTipo().equals("1")) {
				ComidasCollection.listarComidaNoPedido(i);
			}		
		}
		
		if (!Utils.scanner.next().equals("N")) {
			String entrada_id = Utils.scanner.next();
			construtor += 1;
			Utils.limparTela();
		}

		
		//Obtendo opção de prato-principal
		System.out.println("Escolha um prato principal. Caso n�o deseje prato principal, digite 'N':");
		System.out.println("ID | Descrição");
		//Essa fun��o itera a cole��o de comidas e retorna apenas as do tipo "Principal"
		for(int i = 0; i<ComidasCollection.obterTamanhoDaLista();i++) { 		
			if(ComidasCollection.obterComida(i).getTipo().equals("2")) {
				ComidasCollection.listarComidaNoPedido(i);
			}		
		}
		
		if (!Utils.scanner.next().equals("N")) {
		String principal_id = Utils.scanner.next();
		construtor += 1;
		Utils.limparTela();
		}
		
		//Obtendo sobremesa
		System.out.println("Escolha uma sobremesa. Caso n�o deseje sobremesa, digite 'N':");
		System.out.println("ID | Descrição");
		//Essa fun��o itera a cole��o de comidas e retorna apenas as do tipo "Principal"
		for(int i = 0; i<ComidasCollection.obterTamanhoDaLista();i++) { 		
			if(ComidasCollection.obterComida(i).getTipo().equals("3")) {
				ComidasCollection.listarComidaNoPedido(i);
			}		
		}
		
		if (!Utils.scanner.next().equals("N")) {
		String sobremesa_id = Utils.scanner.next();
		construtor += 1;
		Utils.limparTela();
		}
		
		//Obtendo bebida
		System.out.println("Escolha uma bebida. Caso n�o deseje bebida, digite 'N':");

		//Essa fun��o itera a cole��o de bebidas"
		System.out.println("ID | Descrição");
		for(int i = 0; i<BebidasCollection.obterTamanhoDaLista();i++) { 		
				BebidasCollection.listarBebidaNoPedido(i);	
		}
		
		if (!Utils.scanner.next().equals("N")) {
		String bebida_id = Utils.scanner.next();
		construtor += 1;
		Utils.limparTela();
		}
		
		System.out.println("Sumário do pedido:");
		//Traz o pedido
//		switch(construtor) {
//		case 1: 
//		}
		
		
		System.out.println("Confirmar?");
		
		
		
	}

}
