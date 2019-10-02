package classes;

import collections.BebidasCollection;
import collections.ClientesCollection;
import collections.ComidasCollection;
import utils.Utils;

public class Pedido {

	Cliente cl;
	Comida c1;
	Comida c2;
	Comida c3;
	Bebida b;

	public void realizarPedido() {

		Utils.limparTela();
		
		String entrada_id = null;
		String principal_id = null;
		String sobremesa_id = null;
		String bebida_id = null;

		// Obtendo o cliente
		System.out.println("Escolha um cliente abaixo [ID]: ");
		ClientesCollection.listarClientes();
		String cliente_id = Utils.scanner.next();
		Utils.limparTela();

		// Obtendo a opção de entrada
		System.out.println("Escolha uma entrada. Caso n�o deseje uma entrada, digite 'N':");
		System.out.println("ID | Descrição");
		// Essa fun��o itera a cole��o de comidas e retorna apenas as do tipo
		// "Entrada"
		for (int i = 0; i < ComidasCollection.obterTamanhoDaLista(); i++) {
			if (ComidasCollection.obterComida(i).getTipo().equals("1")) {
				ComidasCollection.listarComidaNoPedido(i);
			}
		}

		if (!Utils.scanner.next().equals("N")) {
			entrada_id = Utils.scanner.next();
			Utils.limparTela();
		}

		// Obtendo opção de prato-principal
		System.out.println("Escolha um prato principal. Caso n�o deseje prato principal, digite 'N':");
		System.out.println("ID | Descrição");
		// Essa fun��o itera a cole��o de comidas e retorna apenas as do tipo
		// "Principal"
		for (int i = 0; i < ComidasCollection.obterTamanhoDaLista(); i++) {
			if (ComidasCollection.obterComida(i).getTipo().equals("2")) {
				ComidasCollection.listarComidaNoPedido(i);
			}
		}

		if (!Utils.scanner.next().equals("N")) {
			principal_id = Utils.scanner.next();
			Utils.limparTela();
		}

		// Obtendo sobremesa
		System.out.println("Escolha uma sobremesa. Caso n�o deseje sobremesa, digite 'N':");
		System.out.println("ID | Descrição");
		// Essa fun��o itera a cole��o de comidas e retorna apenas as do tipo
		// "Principal"
		for (int i = 0; i < ComidasCollection.obterTamanhoDaLista(); i++) {
			if (ComidasCollection.obterComida(i).getTipo().equals("3")) {
				ComidasCollection.listarComidaNoPedido(i);
			}
		}

		if (!Utils.scanner.next().equals("N")) {
			sobremesa_id = Utils.scanner.next();
			Utils.limparTela();
		}

		// Obtendo bebida
		System.out.println("Escolha uma bebida. Caso n�o deseje bebida, digite 'N':");

		// Essa fun��o itera a cole��o de bebidas"
		System.out.println("ID | Descrição");
		for (int i = 0; i < BebidasCollection.obterTamanhoDaLista(); i++) {
			BebidasCollection.listarBebidaNoPedido(i);
		}

		if (!Utils.scanner.next().equals("N")) {
			bebida_id = Utils.scanner.next();
			Utils.limparTela();
		}
		
		Utils.limparTela();
		System.out.println("Sum�rio do pedido:");
		System.out.println("-------------------------");
		// Traz o pedido

		Pedido p = new Pedido();
		
		p.cl = ClientesCollection.obterCliente(Integer.parseInt(cliente_id));

		if (entrada_id != null) {
			p.c1 = ComidasCollection.getComida(Integer.parseInt(entrada_id));
		}
		
		if (principal_id != null) {
			p.c2 = ComidasCollection.getComida(Integer.parseInt(principal_id));
		}
		
		if (sobremesa_id != null) {
			p.c3 = ComidasCollection.getComida(Integer.parseInt(sobremesa_id));
		}
		
		if (bebida_id != null) {
			p.b = BebidasCollection.obterBebida(Integer.parseInt(bebida_id));
		}
		
		System.out.println("Item       | Pre�o       ");
		System.out.println("-------------------------");
		
		float total = 0;
		
		if (p.c1 != null) {
			System.out.println(p.c1.getDescricao() + ", " + p.c1.getprecoDeVenda());
			total += p.c1.getprecoDeVenda();
		}
		if (p.c2 != null) {
			System.out.println(p.c2.getDescricao() + ", " + p.c2.getprecoDeVenda());
			total += p.c2.getprecoDeVenda();
		}
		if (p.c3 != null) {
			System.out.println(p.c3.getDescricao() + ", " + p.c3.getprecoDeVenda());
			total += p.c3.getprecoDeVenda();
		}
		if (p.b != null) {
			System.out.println(p.b.getDescricao() + ", " + p.b.getprecoDeVenda());
			total += p.b.getprecoDeVenda();
		}
				
		System.out.println("-------------------------");
		System.out.println("Total: R$ " + total);
		
	}

}
