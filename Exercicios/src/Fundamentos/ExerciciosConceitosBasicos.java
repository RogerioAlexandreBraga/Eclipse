package Fundamentos;
import java.util.Scanner;
public class ExerciciosConceitosBasicos {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Grau Celsios = ");
	double GrauCelsios = entrada.nextDouble();
	System.out.print("Farht. = " + (GrauCelsios * 9/5 + 32));
	
	System.out.print("\n\nGrau Fahrenheit = ");
	double GrauFahrenheit = entrada.nextDouble();
	System.out.print("Cels. = " + (GrauFahrenheit - 32) * (5/9.0));
	
	System.out.print("\n\nPeso = ");
	double Peso = entrada.nextDouble();
	System.out.print("Altura = ");
	double Altura = entrada.nextDouble();
	System.out.println("IMC: " + Peso / (Altura * Altura));

	System.out.print("\n\nNumero para Potência = ");
	int num = entrada.nextInt();
	System.out.println("Quadrado: " + Math.pow(num, 2));
	System.out.print("Cubo: " + Math.pow(num, 3));
	
	System.out.println("\n\nTriangulo");
	System.out.print("Base = ");
	double base = entrada.nextDouble();
	System.out.print("Altura = ");
	double altura = entrada.nextDouble();
	System.out.print("Área = " + base * altura / 2); 
	
	entrada.close();
} 
}