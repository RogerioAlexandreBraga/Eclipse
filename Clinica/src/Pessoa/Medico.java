package Pessoa;

import java.util.Scanner;

public class Medico {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome do M�dico: ");
		
		String medico = entrada.nextLine();
		
		System.out.println("M�dico: " + medico);
		
		entrada.close();		
	}
}
