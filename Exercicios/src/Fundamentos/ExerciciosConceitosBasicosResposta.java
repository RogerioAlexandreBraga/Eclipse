package Fundamentos;

import java.util.Scanner;

public class ExerciciosConceitosBasicosResposta {
public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();
		double conversao1 = ( celsius * 9/5 ) + 32;
		System.out.print("Valor em Farenheit: " + conversao1);
		
		System.out.println("\n\nDigite a temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		double conversao2 = ( fahrenheit -32 ) * 5/9.0;
		System.out.print("Valor em Celsius: " + conversao2);
		
		System.out.println("\n\nDigite o peso:");
		double peso = entrada.nextDouble();
		System.out.println("Digite a altura:");
		double altura = entrada.nextDouble();
		double imc = peso / ( altura * altura );
		System.out.print("IMC: " + imc);
		
		System.out.println("\n\nDigite o valor: ");
		double valor = entrada.nextDouble();
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		System.out.print("O valor ao quadrado é: " + quadrado + ""
				+ "\nO valor ao cubo é: " + cubo);
		
		System.out.println("\n\nDigite a Base:");
		double base = entrada.nextDouble();
		System.out.println("Digite a Altura:");
		double altura1 = entrada.nextDouble();
		double area = (base * altura1) / 2;
		System.out.print("A Área do Triângulo é: " + area);
		
		entrada.close();
}
}