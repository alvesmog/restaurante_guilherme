package utils;
import java.util.Scanner;

public class Utils {
	
	//limparTela
	public static void limparTela() {
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
	}
		
	//scanner
	public static Scanner scanner = new Scanner(System.in);
	
}
