package Pessoa;

import java.util.Scanner;

public class Medico {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome do Médico: ");
		
		String medico = entrada.nextLine();
		
		System.out.println("Médico: " + medico);
		
		entrada.close();		
	}
}
