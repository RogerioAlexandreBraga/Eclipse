package Fundamentos.Operadores;
public class DesafioLogicos {
public static void main(String[] args) {
	
	//Trabalho ter�a (V ou F)
	//Trabalho quinta (V ou F)
	
	boolean trabalho1 = true;
	boolean trabalho2 = false;
	
	//Operadores Bin�rios
	boolean ComprouTV50 = trabalho1 && trabalho2;
	boolean ComprouTV32 = trabalho1 ^ trabalho2;
	boolean ComprouSorvete = trabalho1 || trabalho2;
	
	//Operador Un�rio
	boolean MaisSaudavel = !ComprouSorvete;
	
	System.out.println("Comprou TV 50\"? " + ComprouTV50);
	System.out.println("Comprou TV 32\"? " + ComprouTV32);
	System.out.println("Comprou Sorvete? " + ComprouSorvete);
	System.out.println("Mais Saud�vel? " + MaisSaudavel);
	
}
}