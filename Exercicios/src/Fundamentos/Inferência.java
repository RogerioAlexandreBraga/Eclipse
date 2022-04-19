package Fundamentos;

public class Inferência {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		a = 12.57;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro Texto";
		System.out.println(c);
		
		double d;
		d = 123.65; // (No Double) Variavel Declarada em uma Linha
		System.out.println(d); // (No Double) Variavel Inicializada em outra Linha
		
		var e = 123.65; // (No var) é obrigátorio Declarada e Inicializada na mesma Linha
		System.out.println(e);
		
	}
}