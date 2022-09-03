package exemplo1;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a nota");
		int nota = scanner.nextInt();
		if(nota > 100 || nota<0) {
			System.out.println("Valor invalido");
		}
		
		else if(nota >= 90)
			System.out.println("A");
		else if(nota >= 80)
			System.out.println("B");
		else if(nota >= 70)
			System.out.println("C");
		else if(nota >= 60)
			System.out.println("D");
		else
			System.out.println("e");
		
		scanner.close();
		
		
	
		

	}

}