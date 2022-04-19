package Pessoa;

import java.util.Scanner;

public class Paciente {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome do Paciente: ");
		
		String paciente = entrada.nextLine();
		
		System.out.println("Paciente: " + paciente);
		
		entrada.close();
	}
}
