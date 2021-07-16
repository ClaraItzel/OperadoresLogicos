import javax.swing.*;
import java.util.*;
public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * 
 * Operadores logicos
 * a== b  a es igual a b
 * a>b a es mayor que b
 * a<v a es menor que b
 * 
 */
		System.out.println("Tu nombres es: "+saludo());	
		System.out.println("Tu nombres es: "+saludo2());
	}
	public static String saludo() {
	String a;
	a=JOptionPane.showInputDialog(null, "Introduce tu nombre");
	return a;
	}
	public static String saludo2() {
		String nombre;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		nombre= sc.next();
		return nombre;
		}
}
