package variaveis_tipos_nomes_operadores_matematicos;

/**
 * Classe de exemplo para o exercício da Aula 4 de Variáveis, Tipos de Dados e Operadores Aritméticos.
 * Site - Dio.me
 * Programa - Qébeck Java Digital
 * Curso - Variáveis. Tipos de Dados e Operadores Matemáticos em Java.
 * Tema: Castinação(casting)
 */

public class Casting {

	public static void main(String[] args) {
		
		byte b1;
		short s1 = 1000;
		b1 = (byte) s1;			// Downcast
		
		long l1;
		int i1 = 10;
		l1 = i1;					// Upcast
		
		int i2;
		long l2 = 1000000000000000000L;
		i2 = (int) l2;			// Downcast
		
		int i3;
		long l3 = 10000L;		
		i3 = (int) l3;			// Downcast sem perda de informações
		
		double d1;
		float f1 = 10.5f;
		d1 = f1;					// Upcast
		
		float f2;
		float f3;
		double d2 = 10000.58d;
		f2 = (float) d2;					// Dowcast mas o comprimento da informação cabe dentro do float
		double d3 = 10000.58888888888888888888888888888888888888888888888888888888888888888888888888d;
		f3 = (float) d3;					// Dowcast com muitas perdas de informações
		
		int i4;
		float f4 = 11.5697f;
		i4 = (int) f4;						// Dowcast com perda de dados. Conversão de valores fracionados para números inteiros.
		
		System.out.println("b1: " + b1);
		System.out.println("l1: " + l1);
		System.out.println("i2: " + i2);
		System.out.println("i3: " + i3);
		System.out.println("d1: " + d1);
		System.out.println("f2: " + f2);
		System.out.println("f3: " + f3);
		System.out.println("i4: " + i4);
		
		b1 = (byte) d3;				// Dowcast
		
		System.out.println("b1: " + b1);

	}

}
