package Pessoa;

import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome do Funcion�rio: ");
		
		String nome = entrada.nextLine();
		
		System.out.println("Funcion�rio: " + nome);
		
		entrada.close();
	}
}
