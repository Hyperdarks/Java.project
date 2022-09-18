package exemplo1;

import java.security.SecureRandom;

public class Dado {
	
	private static final SecureRandom randomNumbers = new SecureRandom();

	private enum Status {
		CONTINUE, LOST, WON
	};

	public static int somaDosDados;

	public static int rollDice() {

		int dado1 = 1 + randomNumbers.nextInt(6);
		int dado2 = 1 + randomNumbers.nextInt(6);
		int soma = dado1 + dado2;
		System.out.println("O jogador rolou: " + dado1 + "+" + dado2 + "=" + soma);
		return soma;
	}

	public static void main(String[] args) {
		int meusPontos = 0;
		Status GameStatus= Status.CONTINUE;

		somaDosDados = rollDice();

		switch (somaDosDados) {
		case 7:
		case 11:
			GameStatus = Status.WON;
			System.out.println("O jogador venceu!");
			break;
		case 3:
		case 2:
		case 12:
			GameStatus = Status.LOST;
			System.out.println("O jogador perdeu");
			break;
		default:
			GameStatus = Status.CONTINUE;
			meusPontos = somaDosDados;
			System.out.println("Os pontos são: " + meusPontos);
			break;
			
			
		}
		while (GameStatus == Status.CONTINUE) {
			somaDosDados = rollDice();

			if (somaDosDados == meusPontos) {
				GameStatus = Status.WON;
			} else if (somaDosDados == 7 || somaDosDados == 3) {
				System.out.println(somaDosDados);
				GameStatus = Status.LOST;
			}
			
			if(GameStatus == Status.WON) {
				System.out.println("O jogador venceu");
			}else if(GameStatus == Status.LOST) {
				System.out.println("O jogador perdeu");
			}
		}
	}

}
