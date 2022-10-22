package TesteIniciaisJava;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int M, N;
		
		System.out.print("Quantas linhas vai ter a matriz? ");
		M =sc.nextInt();
		System.out.print("Quantas colunas vai ter a matriz? ");
		N = sc.nextInt();
		
		int[][] mat = new int[M][N];
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j <N; j++) {
			System.out.printf("Elemento [%d, %d]: ", i, j);
			mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("MATRIZ DIGITADA");
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j <N; j++) {
			System.out.printf("%d ", mat[i][j] );
			}
		System.out.println();
		}
		sc.close();
	}

}
