//Candidato: Ramon Pelle
package application;

import utils.FibonacciCalculator;
import utils.ReverseString;

public class Main {
	public static void main(String[] args) {
				
		//(Questão 01) TODO: Somatório de k até o índice. Resposta = 91.
		System.out.println("--- Questão 01 ---");
		int index = 13;
		int k = 0;
		int sum = 0;
		
		while(k < index) {
			k++;
			sum = sum + k;
		}
		
		System.out.println("Soma: " + sum); 
		
		//(Questão 02) TODO: Fibonacci
		System.out.println("\n--- Questão 02 ---");
		FibonacciCalculator.fibonacci(13);

		//(Questão 03 e 04) Respostas no Gupy.
		
		//(Questão 05) TODO: Inverter string sem funções auxiliares
		System.out.println("\n--- Questão 05 ---");
		ReverseString.reverse("Target Sistemas");
	}
}

