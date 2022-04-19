package Controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a Média: ");
		double media = entrada.nextDouble();

		if (media <= 10 && media >= 7) {
			System.out.println("Aprovado");
			System.out.println("Parabéns");
		}

		if (media < 7 && media >= 5) {
			System.out.print("Recuperação");
		}

		boolean CriterioReprovacaoAtingido = media <= 4.9 && media >= 0;
		if (CriterioReprovacaoAtingido) {
			System.out.println("Reprovado");
		}

		entrada.close();

	}
}