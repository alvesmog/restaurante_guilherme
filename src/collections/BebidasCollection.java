package collections;
import java.util.ArrayList;
import classes.Bebida;
import classes.Comida;
import classes.Menu;
import classes.main;
import utils.Utils;

public class BebidasCollection {
	
	private static ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
	
	public static void adicionarBebida(Bebida b) {
		bebidas.add(b);
	}
	
	public static void listarBebidas() {
		System.out.println("LISTAGEM DE BEBIDAS");
		System.out.println("======================================"); 
		System.out.println("ID<--->UNIDADE DE VENDA<--->DESCRI��O");
		System.out.println("======================================"); 
		for (int i = 0; i<bebidas.size(); i++) {
			System.out.println("- " + i + ", " + bebidas.get(i).getDescricao() + ", " + bebidas.get(i).getprecoDeVenda());
			
		}
		
		System.out.println("");
		System.out.println("Digite [v] para voltar");
		
		String opcao = Utils.scanner.next();		
		if (opcao.equals("v")) {
			Menu.menuBebidas();
		}
		
	}
	
	public static void deletarBebidas(int id) {
		bebidas.remove(id);
	}
	
	public static void listarBebidaIndividual(int i) {
		System.out.println("- " + i + ", " + bebidas.get(i).getDescricao() + ", " + bebidas.get(i).getprecoDeVenda());
	}
	
	public static void alterarBebida(int id, Bebida b) {
		bebidas.set(id, b);
	}
	
	public static int obterTamanhoDaLista() {
		return bebidas.size();
	}
	
	public static Bebida obterBebida(int i) {
		return bebidas.get(i);
	}
	
	public static void listarBebidaNoPedido(int i) {
		System.out.println("- " + i + ", " + bebidas.get(i).getDescricao());
	}
		
}
