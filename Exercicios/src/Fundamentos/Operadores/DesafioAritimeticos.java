package Fundamentos.Operadores;
public class DesafioAritimeticos {
public static void main(String[] args) {
	
	int a = (3 + 2) * 6;
	int b = (int) Math.pow(a, 2);
	int c = (b / 3) * 2;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
		
	int d = (1 - 5) * (2 - 7) / 2;
	int e = (int) Math.pow(d, 2);
	System.out.println(d);
	System.out.println(e);
	
	int f = 150 - 100;
	int g = (int) Math.pow(f, 3);
	int h = 10;
	int i = (int) Math.pow(h, 3);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
	System.out.println(i);
	
	int j = g / i;
	System.out.println(j);
	
}
}