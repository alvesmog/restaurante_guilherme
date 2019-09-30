package classes;
import collections.ClientesCollection;
import utils.Utils;

public class Cliente {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Construtores

	public Cliente(String nome) {
		this.setNome(nome);
	}

	// Adicionar Cliente
	
	public static void adicionarCliente() {

		System.out.println("Digite o nome do cliente ");
		String nome = Utils.scanner.next();

		Cliente c = new Cliente(nome);
		ClientesCollection.adicionarCliente(c);
		
		Utils.limparTela();
		System.out.println("Cadastro realizado com sucesso!");
		System.out.println("");
		System.out.println("- Cliente: " + c.nome);

		System.out.println("");
		System.out.println("Digite [v] para voltar");

		String opcao = Utils.scanner.next();
		if (opcao.equals("v")) {
			Menu.menuClientes();
		}

	}

	// Deletar cliente
	
	public static void deletarCliente() {
		
		System.out.println("Digite o índice do cliente que deseja deletar: ");
		System.out.println("");
		ClientesCollection.listarClientes();

		int id = Utils.scanner.nextInt();
		
		ClientesCollection.deletarCliente(id);

		Utils.limparTela();

		System.out.println("");
		System.out.println("Lista atualizada:");
		System.out.println("");
		ClientesCollection.listarClientes();

	}

	// Alterar bebida
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
		System.out.println("Digite um novo valor para 'Unidade de venda'");
		String u = Utils.scanner.next();
		Bebida b = new Bebida("Bebida", u, n);
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

	// Listar bebidas
	public static void listarBebidas() {
		BebidasCollection.listarBebidas();
	}

}
