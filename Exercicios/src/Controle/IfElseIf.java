package Controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a Nota: ");

		double nota = entrada.nextDouble();

		if (nota > 10 || nota < 0) {
			System.out.println("Nota Inv�lida");
		} else if (nota >= 8.1) {
			System.out.println("Conceito A");
			System.out.println("Parab�ns");
		} else if (nota >= 7.1) {
			System.out.println("Conceito B");
			System.out.println("�timo");
		} else if (nota >= 5.0) {
			System.out.println("Conceito C");
			System.out.println("Regular");
		} else if (nota >= 2.0) {
			System.out.println("Conceito D");
			System.out.println("Ruim");
		} else if (nota >= 0.0) {
			System.out.println("Conceito E");
			System.out.println("P�ssimo E");
		}

		System.out.println("Fim!");
		entrada.close();
	}
}