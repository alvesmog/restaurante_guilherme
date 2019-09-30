package classes;

import collections.ClientesCollection;
import collections.ComidasCollection;
import utils.Utils;

public class Pedido {
		
	Pedido(Cliente cl, Comida c, Bebida b){
		
	}
	
	Pedido(){
		
	}
	
	public void realizarPedido() {
		
		Utils.limparTela();
		
		//Obtendo o cliente		
		System.out.println("Escolha um cliente abaixo [ID]: ");
		ClientesCollection.listarClientes();
		String client_id = Utils.scanner.next();
		Utils.limparTela();
		
		//Obtendo a opção de entrada
		System.out.println("Escolha uma entrada. Caso não deseje uma entrada, digite 'N':");
		
		//Essa função itera a coleção de comidas e retorna apenas as do tipo "Entrada"
		for(int i = 0; i<ComidasCollection.obterTamanhoDaLista();i++) { 		
			if(ComidasCollection.obterComida(i).getTipo().equals("1")) {
				ComidasCollection.listarComidaNoPedido(i);
			}		
		}
		String entrada_id = Utils.scanner.next();
		Utils.limparTela();
		
		System.out.println("Escolha um prato principal. Caso não deseje prato principal, digite 'N':");
		//Lista pratos principais
		System.out.println("Escolha uma sobremesa. Caso não deseje sobremesa, digite 'N':");
		//Lista sobremesa
		System.out.println("Escolha uma bebida. Caso não deseje bebida, digite 'N':");
		//Lista bebidas
		
		System.out.println("Sumário do pedido:");
		//Traz o pedido
		
		System.out.println("Confirmar?");
		
		
		
	}

}
