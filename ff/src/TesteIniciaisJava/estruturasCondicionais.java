package TesteIniciaisJava;

import java.util.Scanner;

public class estruturasCondicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora;
		System.out.print("Digite uma hora do dia: ");
		hora = sc.nextInt();
		
		if(hora > 12) {
			System.out.println("Bom dia! ");
			
		}else {
			System.out.println("Boa tarde! ");
		}
		
		
		int x1 , soma1;
		
		soma1 = 0;
		
		System.out.print("Digite o primeiro numero: ");
		x1 = sc.nextInt();
		
		while(x1 != 0) {
			soma1 = soma1 + x1;
			System.out.print("Digite outro numero: ");
			x1 = sc.nextInt();
		}
		
		System.out.println("SOMA = "+ soma1);
		
		
		//
		
		int N, i, x2, soma2;
		
		System.out.print("Quantos numeros serão digitados? ");
		N = sc.nextInt();
		
		soma2 = 0;
		
		for(i = 1; i <= N; i++) {
			System.out.print("Digite um numero: ");
			x2 = sc.nextInt();
			soma2 = soma2 + x2;
			
		}
		
		System.out.print("SOMA = "+ soma2);
		sc.close();
		
		

	}

}
