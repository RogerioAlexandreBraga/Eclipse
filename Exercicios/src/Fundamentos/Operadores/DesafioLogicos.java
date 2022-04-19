package Fundamentos.Operadores;
public class DesafioLogicos {
public static void main(String[] args) {
	
	//Trabalho terça (V ou F)
	//Trabalho quinta (V ou F)
	
	boolean trabalho1 = true;
	boolean trabalho2 = false;
	
	//Operadores Binários
	boolean ComprouTV50 = trabalho1 && trabalho2;
	boolean ComprouTV32 = trabalho1 ^ trabalho2;
	boolean ComprouSorvete = trabalho1 || trabalho2;
	
	//Operador Unário
	boolean MaisSaudavel = !ComprouSorvete;
	
	System.out.println("Comprou TV 50\"? " + ComprouTV50);
	System.out.println("Comprou TV 32\"? " + ComprouTV32);
	System.out.println("Comprou Sorvete? " + ComprouSorvete);
	System.out.println("Mais Saudável? " + MaisSaudavel);
	
}
}