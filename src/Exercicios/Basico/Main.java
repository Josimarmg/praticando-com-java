package Exercicios.Basico;

public class Main {

	public static void main(String[] args) {
		
		// Calculadora
		
		System.out.println("Exerc�cio calculadora");
		Calculadora.soma(7, 5);
		Calculadora.subtracao(8, 1.8);
		Calculadora.multiplicacao(2, 9);
		Calculadora.divisao(5, 2.5);
		
		
		// Mensagem
		
		System.out.println("Exerc�cio mensagem");
		Mensagem.obterMensagem( 9);
		Mensagem.obterMensagem( 14);
		Mensagem.obterMensagem( 1);
		
		
		// Empr�stimo
		
		System.out.println("Exerc�cio emprestimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
	

	}

}
