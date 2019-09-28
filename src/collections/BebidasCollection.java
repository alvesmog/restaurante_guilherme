package collections;
import java.util.ArrayList;
import classes.Bebida;
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
		System.out.println("ID<--->UNIDADE DE VENDA<--->DESCRIÇÃO");
		System.out.println("======================================"); 
		for (int i = 0; i<bebidas.size(); i++) {
			System.out.println("- " + i + ", " + bebidas.get(i).getDescricao() + ", " + bebidas.get(i).getUnidadeDeVenda());
			
		}
		
		System.out.println("");
		System.out.println("Digite [0] para voltar");
		
		String opcao = Utils.scanner.next();		
		if (opcao.equals("0")) {
			main.menuBebidas();
		}
		
	}
	
	public static void deletarBebidas(int id) {
		bebidas.remove(id);
	}
	
	public static String listarBebidaIndividual(int i) {
		return bebidas.get(i).getDescricao();
	}
		
}
