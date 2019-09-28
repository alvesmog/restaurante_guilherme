package collections;
import java.util.ArrayList;
import classes.Bebida;

public class BebidasCollection {
	
	static ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
	
	void adicionarBebida(Bebida b) {
		bebidas.add(b);
	}
	
}
