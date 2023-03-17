
package calculadoraMedia;

import java.util.Scanner;

public class CalculadoraMedia {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos números você deseja inserir? ");
		int contador = scan.nextInt();
		
		int soma = 0;
		for (int i = 0; i < contador; i++) {
			System.out.println("Insira o número " + (i + 1) + ": ");
			int numero = scan.nextInt();
			soma += numero;
			
		}
		
		double media = (double) soma / contador;
		System.out.println("A média é: " + media);
		
	}
}
