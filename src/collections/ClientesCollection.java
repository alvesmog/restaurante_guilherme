package collections;
import java.util.ArrayList;
import classes.Menu;
import utils.Utils;
import classes.Cliente;

//Classe para armazenar os clientes cadastrados

public class ClientesCollection {
	
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public static void adicionarCliente(Cliente c) {
		clientes.add(c);
	}
	
	public static void listarClientes() {
		System.out.println("LISTAGEM DE CLIENTES");
		System.out.println("======================================"); 
		System.out.println("ID<--->NOME");
		System.out.println("======================================"); 
		for (int i = 0; i<clientes.size(); i++) {
			System.out.println("- " + i + ", " + clientes.get(i).getNome());
			
		}
		
		System.out.println("");
		System.out.println("Digite [v] para voltar");
		
		String opcao = Utils.scanner.next();		
		if (opcao.equals("v")) {
			Menu.menuClientes();
		}
		
	}
	
	public static void deletarCliente(int id) {
		clientes.remove(id);
	}
	
	public static void listarClienteIndividual(int i) {
		System.out.println("- " + i + ", " + clientes.get(i).getNome());
	}
	
	public static void alterarCliente(int id, Cliente c) {
		clientes.set(id, c);
	}
		
}
