package variaveis_tipos_nomes_operadores_matematicos;

/**
 * Classe de exemplo para o exercício da Aula 2 de Variáveis, Tipos de Dados e Operadores Aritméticos.
 * Site - Dio.me
 * Programa - Qébeck Java Digital
 * Curso - Variáveis. Tipos de Dados e Operadores Matemáticos em Java.
 * Tema: Tipos de Dados.
 */

public class TiposDados {

	public static void main(String[] args) {
		
		byte b1 = 10;
		byte b2 = 20;
		
		short s1 = 20000;
		//short s2 = 40000;
		
		//int i1 = -10000000000;
		int i2 = 28000;
		
		long l1 = 1000000000000000000L;
		long l2 = 2004005000500055000L;
		
		//float f1 = 4.5;
		float f2 = 10.68f;
		
		double d1 = 85.69;
		double d2 = 99.84d;
		
		char c1 = 'W';
		//char c2 = 'Tw';
		char c3 = '\u0057'; 		/*unicode é o mesmo que W*/
		
		String st1 = "Fulano";
		String st2 = "Cicrano";
		String st3 = "ag dgb se  se  et  t KNBJB &*¨&%& 75894389";
		
		//String dt1 = "09/02/1981";		/* Não está errado, mas existe um comando específico para datas.*/
		
		boolean bo1 = true;
		boolean bo2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s1);
		System.out.println(i2);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(c1);
		System.out.println(c3);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		//System.out.println(dt1);
		System.out.println(bo1);
		System.out.println(bo2);
	}

}
