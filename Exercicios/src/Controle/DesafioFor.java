package Controle;

public class DesafioFor {

public static void main(String[] args) {
	
	String valor = "#";
	for(int i = 1; i <= 5; i++) {
		System.out.println(valor);
		valor += "#";
	}
	
	// Vers�o do desafio
	// N�o pode usar valor num�rico pra colocar no la�o
	
	for(String v = "#"; !v.equals("######"); v += "#") {
		System.out.println(v);
	}
}	
}