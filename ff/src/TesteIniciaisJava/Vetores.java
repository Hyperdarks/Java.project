package TesteIniciaisJava;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		
		double[] vet = new double [N];
		
		
		for(int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		System.out.println();
		System.out.println("NUMEROS DIGITADOS: ");
		
		for(int i = 0; i < N; i++) {
			System.out.println(String.format("%.1f",vet[i]));
		}
		
		
		sc.close();

	}

}
