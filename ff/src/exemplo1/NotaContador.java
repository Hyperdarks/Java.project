package exemplo1;

import java.util.Scanner;

public class NotaContador {
	static float contador, contadorVezes, conA, conB, conC, conD, conE, conF;
	static int nota;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		while (true) {
			System.out.println("Digite a nota:");
			nota = teclado.nextInt();

			if (nota >= 90) {
				System.out.println("A");
				contador = contador + nota;
				contadorVezes++;
				conA++;
			} else if (nota >= 80) {
				System.out.println("B");
				contador = contador + nota;
				contadorVezes++;
				conB++;
			} else if (nota >= 70) {
				System.out.println("C");
				contador = contador + nota;
				contadorVezes++;
				conC++;

			} else if (nota >= 60) {
				System.out.println("D");
				contador = contador + nota;
				contadorVezes++;
				conD++;
			} else if (nota >= 50) {
				System.out.println("E");
				contador = contador + nota;
				contadorVezes++;
				conE ++;

			} else {
				System.out.println("F");
				contador = contador + nota;
				contadorVezes++;
				conF++;

			}
			System.out.println("A media é:\t" + contador / contadorVezes);
			System.out.println("Contador A:\t" + conA + "\nContador B:\t" + conB + "\nContador C:\t" + conC + "\nContador D:\t" 
			+ conD + "\nContador E:\t" + conE + "\nContador F:\t" + conF);

			System.out.println("Você quer continuar?" + "\nsim ou não");
			char opcao = teclado.next().charAt(0);

			if (opcao == 'n'|| opcao == 'N') {
				System.out.println("Você decediu sair" + "\n------------------Programa-encerrado----------------");
				teclado.close();
				System.exit(0);
			}

		}

	}

}
