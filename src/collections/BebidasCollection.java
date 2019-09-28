package collections;
import java.util.ArrayList;
import classes.Bebida;

public class BebidasCollection {
	
	private static ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
	
	public static void adicionarBebida(Bebida b) {
		bebidas.add(b);
	}
	
}
