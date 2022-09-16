package ff;

import java.util.Scanner;

public class CalculadoraSwitch {
	static Scanner teclado = new Scanner(System.in);
	static float resultado, num1, num2;

	public static void main(String[] args) {

		while (true) {
			System.out.println("Escolha a opção\n" + "(+) - adicão\n" + "(-) - subtracao\n" + "(*) vezes\n"
					+ "(/) - dividir\n" + "(s) - sair\n");
			char opcao = teclado.next().charAt(0);

			switch (opcao) {

			case '+':
				entrada();
				resultado = num1 + num2;
				System.out.println(resultado);
				break;

			case '-':
				entrada();
				resultado = num1 - num2;
				System.out.println(resultado);
				break;
			case '*':
				entrada();
				resultado = num1 * num2;
				System.out.println(resultado);
				break;
			case '/':
				entrada();
				resultado = num1 / num2;
				System.out.println(resultado);
				break;
			case 's':
				System.out.println("você decediu sair");
				teclado.close();
				System.exit(0);
				
			default:
				System.out.println("Opção invalida");

			}

		}

	}

	public static void entrada() {
		System.out.println("Escreva o primeiro numero");
		num1 = teclado.nextFloat();
		System.out.println("Escreva o segundo numero");
		num2 = teclado.nextFloat();
	}
}
