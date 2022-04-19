package Pessoa;

import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome do Funcionário: ");
		
		String nome = entrada.nextLine();
		
		System.out.println("Funcionário: " + nome);
		
		entrada.close();
	}
}
