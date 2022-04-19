package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Informe o N�mero: ");
	int num1 = entrada.nextInt();
	
	System.out.print("Informe a Opera��o: ");
	String op = entrada.next();
	
	System.out.print("Informe o N�mero: ");
	int num2 = entrada.nextInt();
	

	// L�gica
	int resultado = "+".equals(op) ? num1 + num2 : 0;
	resultado = "-".equals(op) ? num1 - num2 : resultado;
	resultado = "*".equals(op) ? num1 * num2 : resultado;
	resultado = "/".equals(op) ? num1 / num2 : resultado;
	resultado = "%".equals(op) ? num1 % num2 : resultado;
			
	System.out.printf("%d %s %d = %d", num1, op, num2, resultado);
	
	entrada.close();
}
}