package Controle;

import java.util.Random;
import java.util.Scanner;

public class ExerciciosEstruturaDeControle {
	public static void main(String[] args) {
// 1. Criar um programa que receba um número e 
//verifique se ele está	entre 0 e 10 e é par.
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um Número Válido: ");
		double numero = entrada.nextDouble();
		if (numero > 0 || numero < 10) {
			if (numero % 2 == 0) {
				System.out.println("Número Par = Válido");
			} else {
				System.out.println("Número Impar = Inválido");
			}
		}
		System.out.println();
//2. Criar um programa informa se o ano atual é um ano bissexto.
		System.out.print("Digite o Ano: ");
		double ano = entrada.nextDouble();
		if (ano % 4 == 0) {
			System.out.println("Ano Bissexto");
		} else {
			System.out.println("Ano Não Bissexto");
		}
		System.out.println();
//3. Criar um programa que receba duas notas parciais, calcular a 
//média final. Se a nota do aluno for maior ou igual a 7.0 imprime 
//no console "Aprovado", se a nota for menor que 7.0 e maior do 
//que 4.0 imprime no console "Recuperação", caso contrário imprime 
//no console "Reprovado".
		System.out.print("Nota 1: ");
		double n1 = entrada.nextDouble();
		System.out.print("Nota 2: ");
		double n2 = entrada.nextDouble();
		double media = (n1 + n2) / 2;
		System.out.print("\nMédia: " + media);
		if (media >= 7 && media <= 10) {
			System.out.println(" = Aprovado");
		}
		if (media > 4 && media < 7) {
			System.out.println(" = Recuperação");
		}
		if (media < 4 && media > 0) {
			System.out.println(" = Reprovado");
		}
		System.out.println();
//4. Criar um programa que receba um número 
//e diga se ele é um número primo.
		int ContadorDeDivisores = 0;
		System.out.print("Digite um Número: ");
		int numeroP = entrada.nextInt();
		for (int i = 2; i < numeroP; i++) {
			if (numeroP % i == 0) {
				ContadorDeDivisores++;
			}
		}
		if (ContadorDeDivisores == 0) {
			System.out.println("\nO número " + numeroP + " é primo.");
		} else {
			System.out.println("\nO número " + numeroP + " não é primo.");
		}
		System.out.println();
//5. Refatorar o exercício 04, utilizando a estrutura switch.
		int ContadorDeDivisores2 = 0;
		System.out.print("Digite um Número: ");
		int numeroP2 = entrada.nextInt();
		for (int i = 2; i < numeroP2; i++) {
			if (numeroP2 % i == 0) {
				ContadorDeDivisores2++;
			}
		}
		switch (ContadorDeDivisores2) {
		case 0:
			System.out.println("\nO número " + numeroP2 + " é primo.");
		default:
			System.out.println("\nO número " + numeroP2 + " não é primo.");
		}
		System.out.println();
//6. Jogo da adivinhação: Tentar adivinhar um número entre 
//0 - 100. Armazene um numero aleatório em uma variável. 
//O Jogador tem 10 tentativas para adivinhar o número gerado. 
//Ao final de cada tentativa, imprima a quantidade de tentativas 
//restantes, e imprima se o número inserido é maior ou menor do que 
//o número armazenado.
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numeroN;
		
		do {
			System.out.println("Sorteando numero de 0 e 100...\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			System.out.println("Começou o game");
			tentativas =0;
			
			do {
				tentativas++;
				System.out.printf("\nTentativa %d: ", tentativas);
				numeroN = scanner.nextInt();
				
				if (numeroN > numeroSorteado) {
					System.out.println("\nO numero sorteado é menor que: " + numeroN);
				}	else if (numeroN < numeroSorteado) {
						System.out.println("\nO numero sorteado é maior que: " + numeroN);
					}	else {
							System.out.println("\nVocê acertou em tentativas: " + tentativas);
					} 
			}	while (numeroN != numeroSorteado);
					System.out.println("Digite 0 para sair, ou outro qualquer para continuar: ");
					continuar = scanner.nextInt();
			} while (continuar != 0);
//7. Criar um programa que enquanto estiver recebendo números 
//positivos, imprime no console a soma dos números inseridos, 
//caso receba um número negativo, encerre o programa. 
//Tente utilizar a estrutura do while.
		System.out.println();
		Scanner scanner2 = new Scanner(System.in);
		int somadorDeNumero = 0;
		int numeroR = 0;
		
		while (numeroR >= 0) {
			System.out.println("\nDigite um numero inteiro (Numero Negativo para sair): ");
			numeroR = scanner2.nextInt();
			if (numeroR >= 0) {
				somadorDeNumero += numeroR; // Isso é igual a somadorDeNumeros = somadorDeNumeros + numero;
			System.out.println("\nSoma até o momento: " + somadorDeNumero);
			}
		}
		System.out.println();
//8. Criar um programa que receba uma palavra e imprime 
//no console letra por letra.
		System.out.println();
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("Digite a palavra:");
		String palavra = scanner3.nextLine();
		
		char letras[] = palavra.toCharArray();
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		System.out.println();
//9. Crie um programa que recebe 10 valores e ao final 
//imprima o maior número.
		System.out.println();
		Scanner scanner4 = new Scanner(System.in);
		int maiorValor = 0;
		int contador = 0;
		
		do {
			System.out.println("\nDigite o número: ");
			int valor = scanner.nextInt();
			if (valor > maiorValor) {
				maiorValor = valor;
			}
		contador++;
		}	while (contador != 10);
		System.out.println("O maior valor foi: " + maiorValor);

			entrada.close();
			scanner.close();
			scanner2.close();
			scanner3.close();
			scanner4.close();
			
}
}
