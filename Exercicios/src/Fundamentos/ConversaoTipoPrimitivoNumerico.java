package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 1; //Implicita
		System.out.println(a);
		
		float b = (float) 1.23456788888; //Explicita (CAST)
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c;  //Explicita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;  //Explicita (CAST)
		int f = (int) e;
		System.out.println(f);
		
		
}
}