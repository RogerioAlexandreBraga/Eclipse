package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.print("Você Precisa Inserir o Código: ");
			System.out.print("\n\nDeseja Sair: ");
			texto = entrada.next();
		} while (!texto.equalsIgnoreCase("Sim"));

			System.out.println("Fim");
		
		entrada.close();
	}
}
