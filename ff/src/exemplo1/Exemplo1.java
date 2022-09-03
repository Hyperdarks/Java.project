package exemplo1;
import java.util.Scanner;
public class Exemplo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int diasVividos;
		System.out.println("Digite sua idade ");
		int idade = scanner.nextInt();
		diasVividos = idade*365;
		System.out.print(diasVividos);
		scanner.close();
		

	}

}
