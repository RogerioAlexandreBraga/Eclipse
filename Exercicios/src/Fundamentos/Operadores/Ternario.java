package Fundamentos.Operadores;
public class Ternario {
public static void main(String[] args) {
	
	double media = 7.6;
	String resultado = media >= 7.0 ? "Aprovado" : "Recupara��o";
	
	System.out.println("O Aluno est� " + resultado);
	
	double Nota = 7.5;
	boolean BomComportamento = true;
	boolean PassouPorMedia = Nota >= 7.5;
	boolean TemDesconto = BomComportamento && PassouPorMedia;
	String result = TemDesconto ? "Sim." : "N�o.";
	
	System.out.println("\nTem Desconto? " + result);
	
	
}
}