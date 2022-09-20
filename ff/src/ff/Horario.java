package ff;

import java.util.Scanner;

public class Horario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os segundos");
		int horario = sc.nextInt();
		int resto = horario % 3600;
		
		int hora = horario / 3600 ;
		
		
		
		int minuto = resto / 60;
		
		int segundo = resto % 60;
		
		
		
		System.out.println(hora+ ":"+minuto+":"+segundo);
		
		sc.close();
		

	}

}
