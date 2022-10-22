package TesteIniciaisJava;

import java.util.Locale;

public class teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int idade;
		double salario, altura;
		char genero;
		String nome;
		
		idade = 30;
		salario = 5800.5;
		altura = 1.72;
		genero = 'F';
		nome = "Maria Silva";
		
		//System.out.println("Idade = "+ idade);
		//System.out.println("Salario = "+ String.format("%.2f", salario));
		//System.out.println("Altura = "+ String.format("%.2f", altura));
		//System.out.println("Genero = "+ genero);
		//System.out.println("Nome = "+ nome);
		
		System.out.println("A funcionaria "+nome+", sexo "+genero+", ganha "+
		String.format("%.2f ", salario)+"tem "+altura+" de altura " + "e tem " + idade + " anos");

	}

}
