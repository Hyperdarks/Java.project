package vetorEMatriz;

import java.util.Locale;
import java.util.Scanner;

public class diagonalNegativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Qual a ordem da matriz? ");
		int N = sc.nextInt();
		int[][] mat = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Diagonal Pincipal:");

		for (int i = 0; i < N; i++) {
			System.out.print(mat[i][i] + " ");
		}

		int count = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println();

		System.out.println("QUANTIDADE DE NEGATIVOS: " + count);

		sc.close();
	}
}
