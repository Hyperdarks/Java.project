package vetorEMatriz;

import java.util.Locale;
import java.util.Scanner;

public class somaVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		double[] vet = new double [N];
		
		double soma = 0;
		
		for(int i = 0; i <N; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
			soma = soma + vet[i];
			
		}
		
		double media = soma / N;
		
		System.out.print("VALORES =  ");
		
		for(int i = 0; i <N; i++) {
			
			System.out.print(String.format("%.1f  ", vet[i]));
			
		}
		System.out.println();
		
		System.out.println("SOMA = "+ String.format("%.2f", soma));
		System.out.println("MEDIA = "+ String.format("%.2f", media));
		
		sc.close();
		
	}

}
