package Exercicios.Basico;

/* Calcular e apresentar o valor do volume de uma lata de óleo.
*/

public class LataOleo {

	public static void main(String[] args) {
		
		double V, R, A;
		
		A = 3.5;
		R = 4.2;
		
		V = 3.14159 * R * R * A;
		
		System.out.println("O volume da Lata de Óleo é de: " + V + " m³ ");

	}

}
