package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o primeiro sal�rio: ");
		String valor1 = entrada.next().replace("," , "." );
		System.out.print("Informe o segundo sal�rio: ");
		String valor2 = entrada.next().replace("," , "." );
		System.out.print("Informe o terceiro sal�rio: ");
		String valor3 = entrada.next().replace("," , "." );

		double sal�rio1 = Double.parseDouble(valor1);
		double sal�rio2 = Double.parseDouble(valor2);
		double sal�rio3 = Double.parseDouble(valor3);
		
		double media = (sal�rio1 + sal�rio2 + sal�rio3)/3;
		System.out.println("A m�dia dos sal�rios � " + media);
		
		entrada.close();
}
}
