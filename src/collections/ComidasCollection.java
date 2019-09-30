package collections;
import java.util.ArrayList;
import classes.Comida;
import classes.Menu;
import utils.Utils;

public class ComidasCollection {
	
	private static ArrayList<Comida> comidas = new ArrayList<Comida>();
	
	public static void adicionarComida(Comida b) {
		comidas.add(b);
	}
	
	public static void listarComidas() {
		System.out.println("LISTAGEM DE COMIDAS");
		System.out.println("======================================"); 
		System.out.println("ID<--->UNIDADE DE VENDA<--->DESCRI��O");
		System.out.println("======================================"); 
		for (int i = 0; i<comidas.size(); i++) {
			System.out.println("- " + i + ", " + comidas.get(i).getDescricao() + ", " + comidas.get(i).getUnidadeDeVenda());
			
		}
		
		System.out.println("");
		System.out.println("Digite [v] para voltar");
		
		String opcao = Utils.scanner.next();		
		if (opcao.equals("v")) {
			Menu.menuComidas();
		}
		
	}
	
	public static void deletarComidas(int id) {
		comidas.remove(id);
	}
	
	public static void listarComidaIndividual(int i) {
		System.out.println("- " + i + ", " + comidas.get(i).getDescricao() + ", " + comidas.get(i).getUnidadeDeVenda());
	}
	
	public static void alterarComida(int id, Comida b) {
		comidas.set(id, b);
	}
		
}
