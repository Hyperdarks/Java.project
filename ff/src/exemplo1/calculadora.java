package exemplo1;

//criador Felipe Guilherme Silva
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double div, mult, sub, adi;
		double num1, num2;
		char resposta = 's';

		while (resposta == 's' || resposta == 'S') {
			System.out.println("digite o primeiro numero:");
			num1 = teclado.nextDouble();
			System.out.println("digite o segundo numero:");
			num2 = teclado.nextDouble();
			div = num1 / num2;
			mult = num1 * num2;
			sub = num1 - num2;
			adi = num1 + num2;
			double resultado;

			System.out.println("Selecione a opção\n" + "div \n" + "mult \n" + "sub \n" + "adi \n");
			char opcao = teclado.next().charAt(0);
			
			if (opcao == 'd') {
				resultado = div;
				System.out.println(resultado);
			} else if (opcao == 'm') {
				resultado = mult;
				System.out.println(resultado);
			} else if (opcao == 'a') {
				resultado = adi;
				System.out.println(resultado);
			} else {
				resultado = sub;
				System.out.println(resultado);
			}
			System.out.println("Você quer continuar?\n" + "Sim\n" + "Não\n");
			resposta = teclado.next().charAt(0);
			if (resposta == 'n' || resposta == 'N') {
				teclado.close();
				System.out.println("Você decidiu sair\n" + "---------------Programa encerrado----------------\n");
			}
		}

	}

}
