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
				contadorVezes = contadorVezes + 1;
				conA = conA + 1;
			} else if (nota >= 80) {
				System.out.println("B");
				contador = contador + nota;
				contadorVezes = contadorVezes + 1;
				conB = conB + 1;
			} else if (nota >= 70) {
				System.out.println("C");
				contador = contador + nota;
				contadorVezes = contadorVezes + 1;
				conC = conC + 1;

			} else if (nota >= 60) {
				System.out.println("D");
				contador = contador + nota;
				contadorVezes = contadorVezes + 1;
				conD = conD + 1;
			} else if (nota >= 50) {
				System.out.println("E");
				contador = contador + nota;
				contadorVezes = contadorVezes + 1;
				conE = conE + 1;

			} else {
				System.out.println("F");
				contador = contador + nota;
				contadorVezes = contadorVezes + 1;
				conF = conF + 1;

			}
			System.out.println("A media é:" + contador / contadorVezes);
			System.out.println("Contador A: " + conA + "\nContador B: " + conB + "\nContador C: " + conC + "\nContador D:" 
			+ conD + "\nContador E: " + conE + "\nContador F: " + conF);

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
