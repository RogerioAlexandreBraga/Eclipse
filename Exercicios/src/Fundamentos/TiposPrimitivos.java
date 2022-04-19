package Fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informação do Funcionário
		// Tipos Numéricos Inteiros
		byte AnosDeEmpresa = 23;
		short NumeroDeVoos = 542;
		int Id = 56789;
		long PontosAcumulados = 3_134_845_223L;
		// Tipos Numericos Reais
		float Salario = 11_445.44F;
		double VendasAcumuladas = 2_991_797_103.01;
		// Tipo Booleano
		boolean EstaDeFerias = false; // "ou" true
		// Tipo Caractere
		char Status = 'A'; // 'A' de Ativo
		
		// Dias de Empresa
		System.out.println(AnosDeEmpresa * 365);
		// Numero de Viagens
		System.out.println(NumeroDeVoos / 2);
		// Pontos por Real
		System.out.println(PontosAcumulados / VendasAcumuladas);
		System.out.println(Id + ": Ganha => " + Salario);
		System.out.println("Ferias? " + EstaDeFerias);
		System.out.println("Status: " + Status);
	}
}