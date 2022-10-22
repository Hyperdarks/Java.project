package estruturasSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base do retangulo: ");
		double base = sc.nextDouble();
		System.out.print("Altura do retangulo: ");
		double altura = sc.nextDouble();
		
		double area = base * altura;
	    double perimetro = 2*( base + altura);
	    double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
	    
	    System.out.println(String.format("AREA = %.4f",area));
	    System.out.println(String.format("PERIMETRO = %.4f",perimetro));
	    System.out.println(String.format("DIAMETRO = %.4f",diagonal));
		
		sc.close();

	}

}
