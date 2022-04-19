package Fundamentos.Operadores;
public class Relacionais {
public static void main(String[] args) {
	
	int a = 97;
	int b = 'a';
	
	System.out.println(a == b);
	
	System.out.println();
	
	System.out.println(30 > 70);
	System.out.println(30 >= 7);
	System.out.println(30 < 70);
	System.out.println(30 <= 7);
	System.out.println(30 != 7);

	double Nota = 7.5;
	boolean BomComportamento = true;
	boolean PassouPorMedia = Nota >= 7.5;
	boolean TemDesconto = BomComportamento && PassouPorMedia;
	
	System.out.println("\nTem Desconto? " + TemDesconto);
	
	
}
}