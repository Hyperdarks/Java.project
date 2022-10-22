package estruturasSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.print("Nome: ");
		String nome1 = sc.nextLine();
		System.out.print("Idade: ");
		int idade1 = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa: ");
		System.out.print("Nome: ");
		sc.nextLine();
		String nome2 = sc.nextLine();
		System.out.print("Idade: ");
		int idade2 = sc.nextInt();
		
		double media = (double) (idade1 + idade2) / 2;
		
		System.out.println("A idade media de "+nome1+" e "+ nome2+" eh de "+ media+" anos");
		
		

	}

}
