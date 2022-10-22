package ff;

import java.security.SecureRandom;

public class programa1 {

	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		String nome = "Pedro João";
		System.out.println(nome);
		nome = "Maria da Silva";
		System.out.println(nome);
		int numero = 42;
		System.out.println("O numero é " + numero);
		numero = numero + 58;
		System.out.println("O numero é " + numero);
		for (int i = 0; i < 10; i++) {
			System.out.println("O numero agora é " + i);
		}
		{
			for (int counter = 1; counter <= 20; counter++) {
				int face = 1 + randomNumbers.nextInt(6);

				System.out.printf("%d", face);

				if (counter % 5 == 0) {

					System.out.println();
				}
			}
		}
	}
}