package variaveis_tipos_nomes_operadores_matematicos;

/**
* Classe de exemplo para o exercício da Aula 3 de Variáveis, Tipos de Dados e Operadores Aritméticos.
 * Site - Dio.me
 * Programa - Qébeck Java Digital
 * Curso - Variáveis. Tipos de Dados e Operadores Matemáticos em Java.
 * Tema: Variáveis.
 *
 * Os erros de compilação e o não uso de uma boa prática estão comentados.
*/

public class Variaveis {

	public static void main(String[] args) {
/* Definindo uma variável */	
		
		int i;
	    //int i;
		int I;	
		//int_1a_;
		int _1a;					/* Não dá erro de compilação, mas não gera erro de compilação*/
		int $aq;					/* Não dá erro de compilação, mas não gera erro de compilação*/

		
/* Atribuições as variáveis */
		
		i = 5;
		I = 10;
		_1a = 20;
		$aq = 7;

		
/* Definindo e Atribuindo as variáveis*/
		
		final int j = 10; 			/*Sempre receberar esse valor*/
		//j = 15; 						Erro de compilação ao tentar mudar o valor de final
		int asrn24678nd;
		//int asrn246 78nd
		int asrn2$4678_nd = 10;
		//int asrn2$46%78_nd; = 10;
		
		asrn24678nd = 100;
		asrn2$4678_nd = 10;
		
	
/* Expressividade dos nomes*/
		
		int quantidadeProduto = 50;
		//int QuantidadeProduto;
		final int NUMERO_TENTATIVAS = 5;
		//final int numeroTentativas = 5;
		int QUANTIDADE_OPCOES = 25;			/* Não é uma boa prática se não é "int final", mas não gera erro de compilação*/
		//int qtdProd;
		
		
		System.out.println(i);
		System.out.println(I);
		System.out.println(_1a);
		System.out.println($aq);
		
		System.out.println(j);
		System.out.println(asrn24678nd);
		System.out.println(asrn2$4678_nd);
		
		System.out.println(quantidadeProduto);
		System.out.println(NUMERO_TENTATIVAS);
		System.out.println(QUANTIDADE_OPCOES);

	}

}
