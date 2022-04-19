package Fundamentos.Operadores;
public class Ternario {
public static void main(String[] args) {
	
	double media = 7.6;
	String resultado = media >= 7.0 ? "Aprovado" : "Recuparação";
	
	System.out.println("O Aluno está " + resultado);
	
	double Nota = 7.5;
	boolean BomComportamento = true;
	boolean PassouPorMedia = Nota >= 7.5;
	boolean TemDesconto = BomComportamento && PassouPorMedia;
	String result = TemDesconto ? "Sim." : "Não.";
	
	System.out.println("\nTem Desconto? " + result);
	
	
}
}