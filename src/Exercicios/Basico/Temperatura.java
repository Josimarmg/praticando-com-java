
/*Programa com base em uma temperatura em graus celsius.
Converter e exibir em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F).*/


package Exercicios.Basico;

public class Temperatura {

	public static void main(String[] args) {
		double C, K, F, Re, Ra;
		C = 31.3;
		
		F = C * 1.8 + 32;
		K = C + 273.15;
		Ra = C * 1.8 + 32 + 459.67;
		Re = C * 0.8;
		
		System.out.println("Temperatura em Fahrenheit: " + F);
		System.out.println("Temperatura em Kelvin: " + K);
		System.out.println("Temperatura em Reaumur: " + Ra);
		System.out.println("Temperatura em Rankine: " + Re);
		
	}
}
