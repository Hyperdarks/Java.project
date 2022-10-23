package estruturasRepetitivas;

import java.util.Scanner;
import java.util.Locale;

public class Crescente {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N, M;
		
		System.out.println("Digite dois numeros:");
		N = sc.nextInt();
		M = sc.nextInt();
		
		while(N != M) {
			if(N < M) {
				System.out.println("CRESCENTE!");
			}else {
				System.out.println("DECRESCENTE!");
			}
			System.out.println("Digite outro dois numeros:");
			N = sc.nextInt();
			M = sc.nextInt();
		}
		System.out.println("Você degitou dois numeros iguais, o programa será finalizado.");
		sc.close();
	}

}
